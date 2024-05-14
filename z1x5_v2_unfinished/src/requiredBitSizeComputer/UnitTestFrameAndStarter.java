// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package requiredBitSizeComputer;


import static org.junit.jupiter.api.Assertions.*;
//
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stuffYouDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffYouDontHaveToUnderstand.GivenCodeVersion;


/**
 * (J){@link UnitTestFrameAndStarter} for Required Bit Size Computer
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value 2023_03_15}
 */
public class UnitTestFrameAndStarter {
    
    /**
     * Print information ahead - e.g. about test and environment
     */
    @BeforeAll
    public static void runSetupBeforeAnyUnitTestStarts(){
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    JUnit5/Jupiter:         %s\n",  EnvironmentAnalyzer.getJUnitJupiterVersion() );
        System.out.printf( "    JUnit5/Platform:        %s\n",  EnvironmentAnalyzer.getJUnitPlatformVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "Start of actual tests\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "Remember: The main point is the \"green bar\" (in the JUnit-window)\n" );
        System.out.printf( "\n" );
        //
        System.out.flush();
    }//method()
    
    
    
    
    
    @Test
    public void test0(){
        for( int i=1; i<63; i++ ) {
            final RequiredBitSizeComputer rbsc = new RequiredBitSizeComputer();
            final int bitSize = rbsc.computeBitSize( 0 );
            assertEquals( 1, bitSize );
        }//for
    }//method()    
    
    @Test
    public void test2pNm1(){
        for( int i=1; i<64; i++ ) {
            final RequiredBitSizeComputer rbsc = new RequiredBitSizeComputer();
            final int bitSize = rbsc.computeBitSize( (1L<<i)-1 );
            assertEquals( i, bitSize );
        }//for
    }//method()    
    //
    @Test
    public void test2pN(){
        for( int i=0; i<63; i++ ) {
            final RequiredBitSizeComputer rbsc = new RequiredBitSizeComputer();
            final int bitSize = rbsc.computeBitSize( 1L<<i );
            assertEquals( i+1, bitSize );
        }//for
    }//method()    
    
    @Test
    public void testXXX(){
        doTestRaisingException( -1 );
        doTestRaisingException( -13 );
        doTestRaisingException( Integer.MIN_VALUE );
    }//method()
    //
    private void doTestRaisingException( final int testValue ){
        final RequiredBitSizeComputer rbsc = new RequiredBitSizeComputer();
        int bitSize = (int)( (1L<<31)*Math.random() );  // just a random number to keep the compiler happy - it's YOUR job to compute a serious number
        boolean success = false;
        try{ 
            bitSize = rbsc.computeBitSize( testValue );
        }catch( final Throwable ex ){
            success = (ex instanceof AssertionError)  ||  (ex instanceof IllegalArgumentException);
            if( ! success )  throw( ex );
        }//try
        if( ! success )  fail( String.format( "unexpected behavior for \"%d\" -> \"%d\"",  testValue, bitSize ));
    }//method()
    
}//class

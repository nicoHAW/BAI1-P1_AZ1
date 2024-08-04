// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;
//
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Herald;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * (J){@link UnitTestFrameAndStarter} for Required Bit Size Computer
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
@TestMethodOrder(OrderAnnotation.class)
public class UnitTestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2023_03_21__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
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
        System.out.printf( "    TestFrame version:      %s\n",  version.getDecodedVersion() );
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
    void test0plus0() {
        final Calculator calculator = new Calculator();
        final int computedResult = calculator.add( 0, 0 );
        assertEquals( 0, computedResult );
    }//method()
    
    @Test
    void test1plus1() {
        final Calculator calculator = new Calculator();
        final int computedResult = calculator.add( 1, 1 );
        assertEquals( 2, computedResult );
    }//method()
    
    @Test
    void test1plus2() {
        final Calculator calculator = new Calculator();
        final int computedResult = calculator.add( 1, 2 );
        assertEquals( 3, computedResult );
    }//method()
    
    @Test
    void test2plus1() {
        final Calculator calculator = new Calculator();
        final int computedResult = calculator.add( 2, 1 );
        assertEquals( 3, computedResult );
    }//method()
    
    @Test
    void test23plus19() {
        final Calculator calculator = new Calculator();
        final int computedResult = calculator.add( 23, 19 );
        assertEquals( 42, computedResult );
    }//method()
    
    @Test
    void test1plusM1() {
        final Calculator calculator = new Calculator();
        final int computedResult = calculator.add( 1, -1 );
        assertEquals( 0, computedResult );
    }//method()
    
    @Test
    void testM1plusM1() {
        final Calculator calculator = new Calculator();
        final int computedResult = calculator.add( -1, -1 );
        assertEquals( -2, computedResult );
    }//method()
    
    
    
    
    
    @AfterAll
    public static void runTearDownAfterAllUnitTestsHaveFinished(){
        // Remember: All tests have finished does NOT ensure that all threads have finished ;-)
        //
        final StringBuilder sb = new StringBuilder();
        sb.append( "\n\n" );
        sb.append( "All tests have passed\n" );
        sb.append( "THE END" );
        Herald.proclaimMessage( sb );
    }//method()
    
}//class

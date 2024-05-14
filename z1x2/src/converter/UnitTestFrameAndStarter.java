// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package converter;


import static org.junit.jupiter.api.Assertions.*;
//
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Herald;


/**
 * (J){@link UnitTestFrameAndStarter} for {@link GradeConverter} (Notenpunkte -> "alte Schulnote")
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value 2023_03_15}
 */
public class UnitTestFrameAndStarter {
    
    /**
     * Do "things" ahead - e.g. print information about test and environment
     */
    @BeforeAll
    public static void runSetupBeforeAnyUnitTestStarts(){
        System.out.printf( "General information\n" );
        System.out.printf( "===================\n" );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:              %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                         %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java version:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    JUnit5/Jupiter version:         %s\n",  EnvironmentAnalyzer.getJUnitJupiterVersion() );
        System.out.printf( "    JUnit5/Platformversion:         %s\n",  EnvironmentAnalyzer.getJUnitPlatformVersion() );
        System.out.printf( "    assert enabled?:                %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
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
    public void test0NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 0 );
        assertEquals( "6", grade );
    }//method()    
    
    @Test
    public void test1NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 1 );
        assertEquals( "5-", grade );
    }//method()    
    
    @Test
    public void test2NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 2 );
        assertEquals( "5", grade );
    }//method()    
    
    @Test
    public void test3NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 3 );
        assertEquals( "5+", grade );
    }//method()    
    
    @Test
    public void test4NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 4 );
        assertEquals( "4-", grade );
    }//method()    
    
    @Test
    public void test5NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 5 );
        assertEquals( "4", grade );
    }//method()    
    
    @Test
    public void test6NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 6 );
        assertEquals( "4+", grade );
    }//method()    
    
    @Test
    public void test7NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 7 );
        assertEquals( "3-", grade );
    }//method()    
    
    @Test
    public void test8NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 8 );
        assertEquals( "3", grade );
    }//method()    
    
    @Test
    public void test9NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 9 );
        assertEquals( "3+", grade );
    }//method()    
    
    @Test
    public void test10NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 10 );
        assertEquals( "2-", grade );
    }//method()    
    
    @Test
    public void test11NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 11 );
        assertEquals( "2", grade );
    }//method()    
    
    @Test
    public void test12NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 12 );
        assertEquals( "2+", grade );
    }//method()    
    
    @Test
    public void test13NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 13 );
        assertEquals( "1-", grade );
    }//method()
    
    @Test
    public void test14NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 14 );
        assertEquals( "1", grade );
    }//method()
    
    @Test
    public void test15NP(){
        final GradeConverter gc = new GradeConverter();
        final String grade = gc.convertGrade( 15 );
        assertEquals( "1+", grade );
    }//method()
    
    @Test
    public void testXXNP(){
        doTestRaisingException( 16 );
        doTestRaisingException( 42 );
        doTestRaisingException( 1_000 );
        doTestRaisingException( 1_000_000 );
        doTestRaisingException( -1 );
        doTestRaisingException( -13 );
        doTestRaisingException( Integer.MAX_VALUE );
        doTestRaisingException( Integer.MIN_VALUE );
    }//method()
    //
    private void doTestRaisingException( final int testValue ){
        final GradeConverter gc = new GradeConverter();
        String grade = "grade still needs to be computed";
        boolean success = false;
        try { 
            grade = gc.convertGrade( testValue );
        }catch( final Throwable ex ){
            success = (ex instanceof AssertionError)  ||  (ex instanceof IllegalArgumentException);
            if( ! success )  throw( ex );
        }//try
        if( ! success )  fail( String.format( "unexpected behavior for \"%d\" -> \"%s\"",  testValue, grade ));
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

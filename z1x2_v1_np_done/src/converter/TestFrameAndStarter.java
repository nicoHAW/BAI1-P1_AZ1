// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package converter;


import java.util.Scanner;


/**
 * {@link TestFrameAndStarter} for {@link GradeConverter} (Notenpunkte -> "alte Schulnote")
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value 2023_03_06}
 */
public class TestFrameAndStarter {
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe die Anzahl Notenpunkte ein, die in eine Schulnote umgerechnet werden soll.\n" );
            System.out.printf( "=> " );
            
            final int notenPunkte = workAroundForSeriousUserInterface.nextInt();
            final GradeConverter gc = new GradeConverter();
            final String schulNote = gc.convertGrade( notenPunkte );
            
            System.out.printf( "\n\n" );
            System.out.printf( "%d   ->   %s\n",  notenPunkte, schulNote );
            
            System.out.printf( "\n\n" );
            System.out.printf( "THIS IS THE END" );
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                System.out.flush();
                System.err.printf( "###\n" );
                System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
                System.err.printf( "###\n" );
                System.err.printf( "\n" );
            }//if
            throw( ex );
        }//try
    }//method()
    
}//class

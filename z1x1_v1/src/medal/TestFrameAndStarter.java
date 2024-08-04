// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package medal;


import java.util.Scanner;


/**
 * {@link TestFrameAndStarter} for sport medal computer
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
            System.out.printf( "Gebe das Alter des Teilnehmers ein.\n" );
            System.out.printf( "=> " );
            final int age = workAroundForSeriousUserInterface.nextInt();
            
            System.out.printf( "Gebe die Anzahl der vom Teilnehmer errichten Punkte ein.\n" );
            System.out.printf( "=> " );
            final int points = workAroundForSeriousUserInterface.nextInt();
            
            final SportMedalComputer sportMedalComputer = new SportMedalComputer();
            final String medal = sportMedalComputer.evaluate( points, age );
            
            System.out.printf( "\n\n" );
            System.out.printf("Der Teilnehmer mit dem Alter %d bekommt eine %s-Medaille f�r %d Punkte.\n",  age, medal, points );
            
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

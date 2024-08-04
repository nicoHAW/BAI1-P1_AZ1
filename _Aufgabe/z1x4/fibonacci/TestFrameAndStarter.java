// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package fibonacci;


import java.util.Scanner;


/**
 * {@link TestFrameAndStarter} for {@link FibonacciNumberPrinter}.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value 2023_03_15}
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
            System.out.printf( "Gebe ein, wie viele Fibonacci-Zahlen ausgegeben werden sollen\n" );
            System.out.printf( "und tippe danach Return um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            //
            final int number = workAroundForSeriousUserInterface.nextInt();
            final FibonacciNumberPrinter fnp = new FibonacciNumberPrinter();
            //
            fnp.printFirstFibonacciNumbers( number );
            
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

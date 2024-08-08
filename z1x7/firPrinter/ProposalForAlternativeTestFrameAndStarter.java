// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package firPrinter;


//###
//### Wenn Sie einen eigenen TestFrame entwickeln - was ausdrücklich gut wäre,
//### dann sollten Sie den Klassennamen (mit "Refactoring") ändern
//### Z.B. in  MyAlternativeTestFrame
//###
//### Ein Nachteil des gestellten TestFrames besteht darin, dass er interaktiv ist
//### und damit für reproduzierbare Testläufe eigentlich NICHT geeignet ist.
//### "Hier" sollten Sie Tests entwickeln, die leicht reproduzierbar sind,
//### damit Sie im Falle eines gefundenen Fehlers auch (leicht) testen können, dass Sie
//###   1.) den Fehler wirklich korrigiert und
//###   2.) keine neuen Fehler bei bereits sicheren Code eingebaut
//### haben.
//###
/**
 * Your alternative TestFrame for {@link FirPrinter}.
 * 
 * @author   (your name(s))  based on template from Michael Schaefers
 * @version  (a version number or a date)
 */
public class ProposalForAlternativeTestFrameAndStarter {

    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        try{
            final FirPrinter fp = new FirPrinter();





            // Z.B. bzw. nur als erste Start-Idee/Anregung, wie so etwas aussehen koennte
            //
            fp.printFir( 4 );
            System.out.print( "\n\n\n" );






            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
            // fuehren Sie KEINE Aenderungen unterhalb dieser Zeilen durch.
            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            //
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

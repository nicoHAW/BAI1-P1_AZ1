// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package requiredBitSizeComputer;


//###
//### Wenn Sie einen eigenen TestFrame entwickeln - was ausdruecklich gut waere
//### dann sollten Sie den Klassennamen (mit "Refactoring") aendern
//### Z.B. in  MyAlternativeTestFrame
//###
//### Ein Nachteil des gestellten TestFrames besteht darin, dass er interaktiv ist
//### und damit fuer reproduzierbare Testlaeufe eigentlich NICHT geeignet ist.
//### "Hier" sollten Sie Tests entwickeln, die leicht reproduzierbar sind,
//### damit Sie im Falle eines gefundenen Fehlers auch (leicht) testen koennen, dass Sie
//###   1.) den Fehler wirklich korrigiert und
//###   2.) keine neuen Fehler bei bereits sicheren Code eingebaut
//### haben.
//###
/**
 * Your alternative TestFrame for {@link RequiredBitSizeComputer}.
 * 
 * @author  (your name(s))  based on template from Michael Schaefers
 * @version (a version number or a date)
 */
public class ProposalForAlternativeTestFrameAndStarter {
    
    public static void main( final String... unused ){
        try{
            final RequiredBitSizeComputer requiredBitSizeComputer = new RequiredBitSizeComputer();
            
            
            
            //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
            // Sofern Sie kein Vorwissen und/oder NICHT wissen was Sie tun
            // fuehren Sie (bis auf die Aenderung des Klassennamens)
            // KEINE Aenderungen oberhalb dieser Zeilen durch
            //###
            //###
            //###
            //###   HIER kommt Ihr Code zum Testen hin ;-)
            //###
            //###                    VVVV
            //###                    VVVV
            //###                    VVVV
            //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
            //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
            //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
            //###            VVVVVVVVVVVVVVVVVVVV
            //###               VVVVVVVVVVVVVV
            //###                  VVVVVVVV
            //###                     VV
            
            
            
            // Z.B. bzw. nur als erste Start-Idee/Anregung, wie so etwas aussehen koennte
            long number;
            int bitSize;
            //
            number = 100;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            //
            number = 200;
            bitSize = requiredBitSizeComputer.computeBitSize( number );
            System.out.printf( "Fuer die Zahl %d werden %d Bit(s) benoetigt.\n",  number, bitSize );
            System.out.print( "\n\n" );
            
            
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

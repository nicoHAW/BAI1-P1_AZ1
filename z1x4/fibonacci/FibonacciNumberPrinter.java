// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package fibonacci;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * 
 * 
 * Zur Fibonacci-Zahlen-Folge siehe auch http://de.wikipedia.org/wiki/Fibonacci-Folge.
 * Es soll die "urspüngliche" Fibonacci-Reihe implementiert werden!
 * f(1) = f(2) = 1
 * f(n) = f(n-1) + f(n-2)
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * {@link FibonacciNumberPrinter} - see task.
 * 
 * @author   Nico Pätzel
 * @version  2024/08/06 Version 2 (changed: added Tests)
 */
public class FibonacciNumberPrinter {

    /**
     * printing first Fibonacci numbers. 
     * 
     * @param wantedNumberOfFibonacciNumbers  number of Fibonacci numbers to be printed - Number has to be positive.
     *                                        starting with first Fibonacci number
     */
    public void printFirstFibonacciNumbers( final int wantedNumberOfFibonacciNumbers ){
        //checks if wanted FibuNumber is positive. 
        assert (wantedNumberOfFibonacciNumbers >= 0) : "Pleaser enter positive Number >= 0";

        //Deklarieren
        int fibu1 = 0;
        int fibu2 = 0;
        int currentFibu = 0;       

        for ( int index = 0; index < wantedNumberOfFibonacciNumbers; index++ ) {
            //math for Fibunacci
            fibu1 = fibu2;
            fibu2 = currentFibu;
            currentFibu = fibu1 + fibu2;

            //Assert that checks if current Value is still within values of an int.
            if (Integer.MAX_VALUE - fibu1 < fibu2) {
                System.out.printf("\n\n Danger: Values leaves valid Area of ints\n\n");
                assert (Integer.MAX_VALUE - fibu1 > fibu2) : "Please enter smaller Number or change to Long or Double.";
            }
            
            
            //print
            System.out.printf("%3d ", currentFibu);

            if (index == 0) fibu2++;
            
        }//for 

    }//method()

}//class

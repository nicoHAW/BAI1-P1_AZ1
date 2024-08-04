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
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class FibonacciNumberPrinter {
    
    /**
     * printing first Fibonacci numbers
     * 
     * @param wantedNumberOfFibonacciNumbers  number of Fibonacci numbers to be printed
     *                                        starting with first Fibonacci number
     */
    public void printFirstFibonacciNumbers( final int wantedNumberOfFibonacciNumbers ){

        if (wantedNumberOfFibonacciNumbers > 0) {
            //basis is the Fibonacci sequence as described on Wikipedia, starting with f(0) = 0
            String result = "";
            int beforePrevFibonacciNr = 0;
            int prevFibonacciNr = 0;

            for (int n = 0; n < wantedNumberOfFibonacciNumbers; n++) {
                int currentFibonacciNr = n;
                if (n >= 2) {
                    currentFibonacciNr = beforePrevFibonacciNr + prevFibonacciNr;
                }
                beforePrevFibonacciNr = prevFibonacciNr;
                prevFibonacciNr = currentFibonacciNr;
                
                if (n == wantedNumberOfFibonacciNumbers - 1) {
                    //last run
                    result = result + currentFibonacciNr;
                } else {
                    result = result + currentFibonacciNr + ",";
                }
            }
            System.out.println(result);
        } else {
            System.out.println("please enter a number above 0 for valid results");
        }
        
    }//method()
    
}//class




































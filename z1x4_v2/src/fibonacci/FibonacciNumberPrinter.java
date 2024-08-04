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

        //Declaration

        int n = wantedNumberOfFibonacciNumbers;     // count helper set to wanted numbers of fibonacci
        int fibuLast;                              //last fibonacci number
        int fibuPenum;                             //number before the last fibonacci
        int fibuSum;                               //current cum of fibonacci
        int i;                                     // count helper 

        //Fibonacci 

        /* condition:
         * positive or negative Fibonacci 
         */

        // positive Fibonacci Number
        if (wantedNumberOfFibonacciNumbers >= 0) {

            // variable declaration for positive Fibonacci

            fibuLast = 0;
            fibuPenum = 1;
            fibuSum = fibuLast + fibuPenum;

            // math for fibonacci
            for (i = 0; i < n; i++) {
                fibuSum = fibuLast + fibuPenum;

                // Print result

                if (i < n-1) { //prints all numbers except the last one
                    System.out.printf("%d, ", fibuSum); 
                } 
                else { //prints only the last wanted number.
                    System.out.printf("%d", fibuSum);
                }

                //Overhand Numers for next iteration.
                fibuPenum = fibuLast;
                fibuLast = fibuSum;
            }

        }
        //negative Fibonacci
        if (wantedNumberOfFibonacciNumbers < 0) {

            // variable declaration for positive Fibonacci

            fibuLast = 0;
            fibuPenum = -1;
            fibuSum = fibuLast - fibuPenum;

            // math for fibonacci
            for (i = 0; i > n; i--) {
                fibuSum = fibuLast + fibuPenum;

                // Print result

                if (i > n+1) { //prints all numbers except the last one
                    System.out.printf("%d, ", fibuSum); 
                } 
                else { //prints only the last wanted number.
                    System.out.printf("%d", fibuSum);
                }

                //Overhand Numers for next iteration.
                fibuPenum = fibuLast;
                fibuLast = fibuSum;
            }

        }



        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()

}//class

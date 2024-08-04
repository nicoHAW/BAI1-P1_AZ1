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

        /* 
         * fibu1, fibu2 are varibales to save previouse states of the fibuSum, fibuSum is alwas the current sum
         * n defines the wanted fibuncacci numbers
         */	
        int n = wantedNumberOfFibonacciNumbers, fibu1 = 0, fibu2 = 1, fibuSum;    

        /* a for loop that does the math fibuSum = fibu1 + fibu2 as long as i is smaller than n
         *the i is a placeholder for n and is just for counting the number of loops.
         */
        
        assert wantedNumberOfFibonacciNumbers > 1 : "Please enter a correct Number above 1";
        
        for (int i = 0; i < n; i++) {

            fibuSum = fibu1 + fibu2;

            /*
             * To avoid the "," after the last number an if-else statement prints two different strings.
             * As long as i is n-1 the statement with "," will be printed - as longs as i equals n-1 the statement without "" will be printed.
             */
            if (i < n-1) {
                System.out.printf("%d, ", fibuSum);
            } 
            else {
                System.out.printf("%d", fibuSum);
            }
            /*
             * New definiton of fibu-numbers, the smallest number will be replaced (fibu2) by the second smallest (fibu1). 
             * fibu1 will be the highest number for the next lop
             */
            fibu2 = fibu1;
            fibu1 = fibuSum;   	
        }



        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()

}//class

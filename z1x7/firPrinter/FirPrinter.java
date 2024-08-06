// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package firPrinter;
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
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * {@link FirPrinter} - see task.
 * 
 * @author   Nico Pätzel 
 * @version  Version 1
 */
public class FirPrinter {

    /**
     * print fir
     * 
     * @param height height of fir
     */
    public void printFir( int height ){

        assert ( height > 0 ) : "Please enter valid heigth > 0.";


        for (int i = 1; i <= height; i++) {
            
            // Ausgabe der Punkte Links
            for (int j = 1; j <= height - i; j++) {
                System.out.print(".");
            }
            
            // Ausgabe der Sterne
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
         // Ausgabe der Punkte Rechts
            for (int j = 1; j <= height - i; j++) {
                System.out.print(".");
            }
            System.out.println(); // Zeilenumbruch
        }



        // Fügen Sie hier Ihren Code ein
        // bzw. ersetzen Sie diesen Kommentar durch Ihren Code.
        // ...



        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()

}//class

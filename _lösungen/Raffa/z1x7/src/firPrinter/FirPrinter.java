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
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class FirPrinter {

    /**
     * print fir
     * 
     * @param height height of fir
     */
    public void printFir( int height ){
        
        for (int i = 1; i <= height; i++) {
            String currentLine = "";
            int nrOfLeadingAndTrailingDots = height - i;
            for (int d = 1; d <= nrOfLeadingAndTrailingDots; d++) {
                //print each dot on the left
                currentLine = currentLine + ".";
            }

            int nrOfNeededNeedles = (height * 2) - (nrOfLeadingAndTrailingDots * 2) - 1;
            for (int s = 1; s <= nrOfNeededNeedles; s++) {
                //print the stars, the "needles" of the tree, in the middle
                currentLine = currentLine + "*";
            }

            for (int d = 1; d <= nrOfLeadingAndTrailingDots; d++) {
                //print each dot on the right
                currentLine = currentLine + ".";
            }
            System.out.println(currentLine);
        }

    }//method()

}//class

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
        
        // Lösung von Laurin - nicht meine. Eigene Lösung finden. 
        
        for (int i = 0; i < height; i++) {
            
            for (int j = 1; j < (height * 2) - 1; j++) {
                
                if (j >= height - i && j <= height ) {
                    System.out.printf("*");
                }
                
                System.out.printf(" ");
            }
            
            System.out.printf("\n");
            
        }
        
    }//method()
    
}//class

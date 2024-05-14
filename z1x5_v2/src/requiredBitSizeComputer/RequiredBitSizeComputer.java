// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package requiredBitSizeComputer;
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
 * {@link RequiredBitSizeComputer} - see task.
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class RequiredBitSizeComputer {
    
    /**
     * compute required bit size to code positive number
     * 
     * @param number  the number for that the required bit size shall be computed
     * @return required bit size to compute number
     */
    public int computeBitSize( final long number ){
 
        
        
        // Declaration and initialisation
        
        int loopCounter = 0; //counts loop repeats
        int numberSystem = 2; // base of number system
        long interimResult = number; //saves results for math reasons
        
        // Math
        
        for (long i = interimResult; i >= 1; i = interimResult) {
            interimResult = number/numberSystem;
            loopCounter++;

        }
        
        
        // "Code-Vorgabe":
        
        int resu;
        resu = loopCounter;
        
        
        // berechne die Anzahl der benötigten Bits um number zu codieren
        
        
        
        return resu;
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()
    
}//class

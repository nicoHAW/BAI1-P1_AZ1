// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package temperatureConverter;
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
 * {@link TemperatureConverter} - see task.
 * 
 * @author   Nico Pätzel 
 * @version  2024/08/06 Version 1
 */
public class TemperatureConverter {
    
    /**
     * printing table
     */
    public void printTable(){
        //Deklarieren
        int tempCelsius;
        int tempFahrenheit;
        
      //initi
        tempCelsius = 0;
        tempFahrenheit = 0;
        
        
        System.out.printf( "Temperatur-Umrechnungstabele\n" );
        System.out.printf( "=============================\n" );
        System.out.printf( "C          F\n" );
        System.out.printf( "------------\n" );
        
        while ( tempCelsius < 100 ) {
        
            //covert temp plus 0,5 for Intervall
            tempFahrenheit = (int) (tempCelsius * ((double) 9/5) + 32 + 0.5); 
            
            System.out.printf( "%4d     %4d\n", tempCelsius, tempFahrenheit );
            
            tempCelsius += 3;
            
        }//print Method.
        
        
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()
    
}//class

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
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class TemperatureConverter {
    
    /**
     * printing table
     */
    public void printTable(){

        System.out.println("Temperatur-Umrechnungstabelle");
        System.out.println("=============================");
        System.out.printf( "%-4s", "C");
        System.out.printf( "%5s\n", "F");
        System.out.println("---------");
        for (double i = 0; i <= 100; i += 3) {
            int celsius = (int)i;
            //Grad-Fahrenheit = Grad-Celsius * 9/5 + 32.
            double fahrenheit = i * 9/5 + 32;
            int customRoundedFahrenheit = (int)fahrenheit; //casting to int always rounds down
            double remainderFahrenheit = (fahrenheit * 10) % 10;
            if (remainderFahrenheit >= 5) {
                //round up
                customRoundedFahrenheit += 1;
            }
            System.out.printf( "%-4d", celsius);
            System.out.printf( "%5d\n", customRoundedFahrenheit);
        }       

    }//method()
    
}//class

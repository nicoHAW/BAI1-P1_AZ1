package temperatureConverter;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Spachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" fuer Erklaerungen und Ausfuehrungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 * Loeschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung muessen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * Temperature Converter - see task
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
        System.out.println("==============================");
        System.out.println("  C   F");
        System.out.println("---------");

        // Wiederholen Sie über die Temperatur in Celsius von 0 bis 100 Grad
        for (int celsius = 0; celsius <= 100; celsius += 3) {
            
            // Berechnen Sie die Temperatur in Fahrenheit
            float fahrenheit = (celsius * 9.0F / 5.0F) + 32.0F;

            // Geben die Temperatur in Celsius und Fahrenheit aus
            System.out.printf("%3.0f %3.0f%n" ,celsius, fahrenheit);
        }
    }
}

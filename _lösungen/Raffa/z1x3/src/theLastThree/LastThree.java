// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package theLastThree;
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
 * The {@link LastThree} - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class LastThree {

    //i would use an array and iterate through the last 3 entries, since thats not allowed:
    int thirdNewestValue; //the oldest entry that we save
    int secondNewestValue; //the middle child
    int newestValue; //the newest entry that we save
    int counter;

    public LastThree(){}

    public void printLastThree(){
        String result = "";
        switch (counter) {
        case 0:
            break;
        case 1:
            result = String.format("last value: %d", this.newestValue);
            break;
        case 2:
            result = String.format("last two values: %d, %d", this.secondNewestValue, this.newestValue);
            break;
        default:
            result = String.format("last three values: %d, %d, %d", this.thirdNewestValue, this.secondNewestValue, this.newestValue);
            break;
        }
        //        if (this.thirdNewestValue != -1) {
        //            result = String.format("last three values: %d, %d, %d", this.thirdNewestValue, this.secondNewestValue, this.newestValue);
        //        } else if (this.secondNewestValue != -1) {
        //            result = String.format("last two values: %d, %d", this.secondNewestValue, this.newestValue);
        //        } else if (this.newestValue != -1) {
        //           result = String.format("last value: %d", this.newestValue);
        //        } else {
        //            result = "no values entered yet";
        //        }

        System.out.printf(result);
    }//method()

    public void processNewValue( int value ){
        this.thirdNewestValue = this.secondNewestValue;
        this.secondNewestValue = this.newestValue;
        this.newestValue = value;
        this.counter++;
    }//method()


    /**
     * ^^^^^^^^^^^^^^^^
     * custom test area
     * ^^^^^^^^^^^^^^^^
     */
    //    public int valueArray[];
    //
    //    public void printLastThreeFromArray(){
    //        String result = "last three values: ";
    //        for (int i = 0; i < valueArray.length; i++) {
    //            result = result + valueArray[i];
    //        }
    //        System.out.println(result);
    //    }//method()
    //
    //    public void processNewValueUsingArray( int value ){
    //        valueArray.a
    //    }//method()
}

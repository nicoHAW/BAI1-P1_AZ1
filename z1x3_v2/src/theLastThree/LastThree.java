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
 * @author   (Nico Pätzel, Melvin) 
 * @version  (Version 1 - 21.04.2023)
 */
public class LastThree {

    // Declaration variables 
    int lastNum;       //saves last number
    int penuNum;       //saves number before last number
    int thirdLastNum;  //saves third last number
    int valueCounter;       //counts process.NewValue
    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){

        // Initializing variables 
        lastNum = 0;
        penuNum = 0;
        thirdLastNum = 0;
        valueCounter = 0;

    }//method()



    /**
     * print the last three numbers/values
     */
    public void printLastThree(){

        /* 
         * Print Statements
         * Prints based of counter value.
         */

        if (valueCounter >= 3) {
            System.out.printf("%d, %d, %d" ,thirdLastNum, penuNum, lastNum);          
        } else if (valueCounter == 2) {
            System.out.printf("%d, %d", penuNum, lastNum);
        } else if (valueCounter == 1) {
            System.out.printf("%d", lastNum);
        } else {
            System.out.printf("Please enter at least one Number.");
        }

    }

    //method()

    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue( int value ){

        // Increase valueCounter by 
        valueCounter++;
        
        /* set variable LastNum to value of the last Number. 
         * Witch each Number, give last Number to PenuNum, and PenuNum to ThirdLastNum.
         */

        thirdLastNum = penuNum;
        penuNum = lastNum;
        lastNum = value; 


    }//method()

}

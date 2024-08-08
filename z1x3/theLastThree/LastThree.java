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
 * @author   Nico Pätzel 
 * @version  2024/08/06 Version 1
 */
public class LastThree {

    //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    //
    // U.U. müssen Sie diesen Kommentar durch geeigneten Code ersetzen.
    // Sollte "hier" kein Code nötig sein, löschen diesen Kommentar einfach.
    //
    // Hier wäre die geeignete Stelle für mögliche 
    //      Zustandsvariablen / Exemplarvariablen = Objekt-spezifische Variablen oder
    //      (u.U. darauffolgend) einen Konstruktor,
    // sofern derartiges benötigt wird.
    // Es ist Ihre Entscheidung und sie sollte Sinn machen.
    //
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


    int LastNmbr;
    int scndLastNmbr;
    int thrdLastNmbr;

    int countProcessMethod; //counts how often processNewValue() has been activated.

    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){        
        this.LastNmbr = 0;
        this.scndLastNmbr = 0;
        this.thrdLastNmbr = 0;
        this.countProcessMethod = 0;
    }//method()



    /**
     * print the last three numbers/values
     */
    public void printLastThree(){

        if ( this.countProcessMethod >= 3) {
            System.out.printf("%2d %2d %2d \n", this.thrdLastNmbr, this.scndLastNmbr, this.LastNmbr);  

        } else if (this.countProcessMethod == 2) {
            System.out.printf("%2d %2d \n", this.scndLastNmbr, this.LastNmbr);

        } else if (this.countProcessMethod == 1) {
            System.out.printf("%2d \n", this.LastNmbr);

        } else System.out.printf(" nix \n");
        
    }//method()

    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue( int value ){
        this.countProcessMethod++;

        this.thrdLastNmbr = scndLastNmbr;
        this.scndLastNmbr = LastNmbr;
        this.LastNmbr = value;

    }//method()

}

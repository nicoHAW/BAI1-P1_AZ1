// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
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
 * 
 * Achtung!
 * Die folgenden Kommentare versuchen die Dinge mit einfachen Worten zu erklären, dies geht auf Kosten der Präzision.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


// Hier steht das Package zu dem die Klasse gehört.
package firstDemo;


// Hier beginnt die Klasse. Die erkennt man am Keyword class
public class FirstVariableDemo {
    
    // Hier wird eine Zustandsvariable deklariert.
    // Je nachdem welchen Effekt man betonen will, könnte man hier auch von einer
    // Exemplarvariablen, Instanzvariablen, objektspezifischen Variablen oder einem Feld sprechen.
    // Die Deklaration einer Zustandvariablen steht innerhalb einer Klasse (class), aber außerhalb einer Methode.
    // Zustandvariablen sind geeignet sich Werte über Methodenaufrufe hinweg zu merken.
    public int stateVariable;
    
    
    
    // Hier steht der Konstruktor. Der Name des Konstruktors entspricht dem namen der Klasse.
    // Der Konstruktor hat die Aufgabe die Zustandsvariablen zu initialisieren.
    // (Konkret hat der Konstruktor die Aufgabe "das entstehende Objekt" zu initialisieren und dies bedeutet insbesondere die Zustandvariablen des Objektes zu initialisieren)
    public FirstVariableDemo(){
        stateVariable = 0;
    }//constructor()
    
    
    
    // Hier steht eine Methode. Die Methode fasst Arbeitsschritte zusammen, die sich so wiederverwenden lassen
    public void runVariableDemo(){
        for( int loopIndex=0;  loopIndex<10;  loopIndex++ ){
            System.out.printf( "loopIndex = %d\n", loopIndex );
            System.out.printf( "  incrementLocalVariable()  liefert  %d\n",  incrementLocalVariable() );
            System.out.printf( "  incrementStateVariable()  liefert  %d\n",  incrementStateVariable() );
            System.out.printf( "\n" );
        }//for
    }//method()
    
    // Hier steht eine Methode, die einen berechneten Wert abliefert
    // Diese Methode nutzt eine lokale Variable.
    // Lokale Variablen sind NICHT geeignet sich  Werte über Methodenaufrufe hinweg zu merken.
    public int incrementLocalVariable(){
        // Hier wird eine lokale Variable deklariert und initialisiert.
        // Die Deklaration einer lokalen Variablen erfolgt innerhalb einer Methode.
        // BEVOR ein Wert aus einer lokalen Variablen gelesen werden kann, muss der jeweiligen lokalen Variablen ein Wert zugewiesen werden.
        int localVariable = 0;                                                  // Hier wird eine lokale Variable deklariert und initialisiert.
        localVariable = localVariable +1;                                       // Der Wert der lokalen Variablen wird um eins erhöht
        return localVariable;                                                   // Der Wert der lokalen Variaben wird als Ergebnis abgeliefert.
    }//method()
    
    // Hier steht eine Methode, die einen berechneten Wert abliefert
    // Diese Methode nutzt eine Zustandsvariable.
    public int incrementStateVariable(){
        stateVariable = stateVariable +1;                                       // Der Wert der Zustandsvariablen wird um eins erhöht
        return stateVariable;                                                   // Der Wert der Zustandsvariaben wird als Ergebnis abgeliefert.
    }//method()
    
}//class

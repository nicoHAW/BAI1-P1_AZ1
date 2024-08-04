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
 * @version  (Version 1.2 - 14.04.2023)
 */
public class LastThree {
    
    // Initializing variables for the three numbers. 
	
    int lastNum, penuNum, thirdLastNum, counter; 
    
    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){
    	 // set variables to zero - question: necessary?. 
    	lastNum = 0;
    	penuNum = 0;
    	thirdLastNum = 0;
    	counter = 0; 
    	
    }//method()
    
    
    
    /**
     * print the last three numbers/values
     */
    public void printLastThree(){
    	
    	 /* Order to only print a variable if its not zero to avoid giving output zeros.
    	  * causes a problem if a new number is a zero.
    	  * question: how to avoid that problem? 
    	  */
    	
        if (thirdLastNum != 0) {
        	System.out.printf("%d ",thirdLastNum);      	
        } else {
        	System.out.printf("");
        }
        
        if (penuNum != 0) {
    		System.out.printf("%d ",penuNum);
        } else {
        	System.out.printf("");
        }
    	
        if (lastNum != 0) {
        System.out.printf("%d \n",lastNum);
    	} else {
        	System.out.printf("");
        }
 
    }//method()
    
    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue( int value ){
   	 /* set variable LastNum to value of the last Number. 
   	  * Witch each Number, give last Number to PenuNum, and PenuNum to ThirdLastNum.
   	  */
    	counter++;
    	
    	thirdLastNum = penuNum;
        penuNum = lastNum;
        lastNum = value; 

    	
    }//method()
    
}

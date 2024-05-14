// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package converter;
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
 * {@link GradeConverter} - see task.
 * 
 * @author   (Nico Pätzel, Melvin) 
 * @version  (Version 1 / 14.04.2024)
 */
public class GradeConverter {
    
    /**
     * Converts "Notenpunkte"  into old german "Schulnote"
     * 
     * @param np  Notenpunkte number of  points earned by participant
     * @return    old german "Schulnote"
     */
    public String convertGrade( final int np ){
             
        
        // "Code-Vorgabe"
        
        
        // Deklaration und Initialisierung
        String result = "";
        
        
        switch(np) {
    	case 0:
	    	result = "6";
	    	break;
	    case 1:
	    	result = "5-";
	    	break;
	    case 2:
	    	result = "5";
	    	break;
	    case 3:
	    	result = "5+";
	    	break;
	  	case 4:
	    	result = "4-";
	    	break;
	    case 5:
	    	result = "4";
	    	break;
	    case 6:
	    	result = "4+";
	    	break;
	    case 7:
	    	result = "3-";
	    	break;
	    case 8:
	    	result = "3";
	    	break;
	  	case 9:
	    	result = "3+";
	    	break;
	  	case 10:
	    	result = "2-";
	    	break;
	    case 11:
	    	result = "2";
	    	break;
	    case 12:
	    	result = "2+";
	    	break;
	    case 13:
	    	result = "1-";
	    	break;
	    case 14:
	    	result = "1";
	    	break;
	  	case 15:
	    	result = "1+";
	    	break;
    }
        
        return result;
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()
    
}//class

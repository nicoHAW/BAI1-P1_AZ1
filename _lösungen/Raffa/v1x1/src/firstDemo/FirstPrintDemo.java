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


// Hier steht die Klasse. Die Klasse ist quasi die wichtigste Einheit beim Programmieren mit Java
public class FirstPrintDemo {
    
    // Hier steht eine Methode. Methoden enthalten die "Aktivitaeten"
    // also die Anweisungen, die besagen was das Programm tun soll
    public void runPrintDemo(){
        
        // Abschnitt 1
        
        System.out.print( "ein Text" );                                         // Ausgabe von "ein Text"
        System.out.print( "noch ein Text" );                                    // Ausgabe von "noch ein Text" direkt dahinter
        System.out.println();                                                   // neue Zeile
        
        System.out.print( "ein Text" + " " + "noch ein Text" );                 // wie oben, nur in einer Zeile und mit Leerzeichen dazwischen
        System.out.println();                                                   // neue Zeile
        
        System.out.println( "ein Text" + " " + "noch ein Text" );               // wie oben - jetzt wirklich alles in einer Zeile
        
        System.out.println( "ein Text noch ein Text" );                         // so geht es natürlich auch
        
        
        
        // Abschnitt 2a
        
        System.out.printf( "%n");                                               // neue Zeile
        System.out.printf( "\n");                                               // neue Zeile
        
        
        // Abschnitt 2b
        
        char c = 'K';
        System.out.printf( "%c",  c );                                          // die Zeichen-Variable c wird ausgegeben
        System.out.printf( "\n");                                               // neue Zeile
        //
        System.out.printf( "%c\n",  c );                                        // wie zuvor - nur in einer Zeile
        
        String text = "dies ist ein String";
        System.out.printf( "%s",  text );                                       // der String(die Zeichenkette) text wird ausgegeben
        System.out.printf( "\n");                                               // neue Zeile
        //
        System.out.printf( "%s\n",  text );                                     // wie zuvor - nur in einer Zeile
        
        System.out.printf( "\n");                                               // neue Zeile
        
        
        // Abschnitt 2c
        
        int x = 42;
        int y = 13;
        System.out.printf( "%d\n",  x );                                        // die ganzzahlige Variable x wird als Dezimalwert ausgegeben
        System.out.printf( "%6d\n",  x );                                       // wie eben – es werden 6 Stellen (rechtsbündig) reserviert
        System.out.printf( "%-3d\n",  x );                                      // wie eben – es werden 3 Stellen (linksbündig) reserviert
        System.out.printf( "%d %d\n",  x, y );                                  // die ganzzahligen Variablen x und y werden jeweils als Dezimalwert ausgegeben
        
        System.out.printf( "\n");                                               // neue Zeile
        
        
        
        // Abschnitt 3
        
        // Anfänger sollten das Folgende zunächst besser ignorieren
        // Das Zeichen ~ soll helfen die Effekte der Formatierung zu verstehen
        System.out.printf( ".........................\n" );
        System.out.printf( "~%d~%d~%d~\n",  1, 2, 3 );
        System.out.printf( "~%2d~%3d~\n",  4, 5 );
        System.out.printf( "~%04d~%-3d~\n",  6, 7 );
        System.out.printf( "~%d~%x~%X~\n",  27, 28, 29 );
        System.out.printf( "~%7.4f~%06.3f~%-8.2f~\n",  (1.0/3), (2.0/3), (5.0/7) );
        System.out.printf( "~%c~%s~%5s~%-4s~\n",  'a', "bb", "ccc", "dd" );
        //
        // Die nächste Zeile ist als Anti-Beispiel zu verstehen
        // Konkret werden die Argumente nicht in der Übergabereihenfolge ausgegeben
        // (Nicht nur) mit printf lassen sich auch Dinge machen, die schwer lesbar sind - tun sie es nicht ;-)
        // Leicht lesbarer Code ist ein wichtiges Ziel beim Programmieren. Es gilt: Es muss NICHT leicht sein Code zu schreiben, ES MUSS LEICHT SEIN CODE ZU LESEN
        // Das Anti-Beispiel / die nachfolgende Zeile adressiert das falsche Ziel - sie ist NICHT leicht lesbar
        System.out.printf( "~%2$d~%4$d~%3$d~%1$d~\n",  1, 2, 3, 4 );            // tun Sie es nicht ;-)
        System.out.printf( ".........................\n" );
        
    }//method()
    
}//class

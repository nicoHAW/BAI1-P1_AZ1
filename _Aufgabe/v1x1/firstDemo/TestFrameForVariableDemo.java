// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package firstDemo;


import firstDemo.stuffYouDontHaveToUnderstand.EnvironmentAnalyzer;


public class TestFrameForVariableDemo {
    
    public static void main( final String... unused ){
        System.out.printf( "Zunaechst ein paar Informationen zum Environment:\n" );
        System.out.printf( "    Java:               %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    #Cores:             %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "\n\n\n\n" );
        
        
        System.out.printf( "Nun ein Blick auf die Werte der Variablen \"ueber die Zeit\":\n" );
        System.out.printf( "\n" );
        final FirstVariableDemo firstVariableDemo = new FirstVariableDemo();
        firstVariableDemo.runVariableDemo();
    }//method()

}//class

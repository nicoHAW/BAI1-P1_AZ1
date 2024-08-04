// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package temperatureConverter;


/**
 * {@link TestFrameAndStarter} for {@link TemperatureConverter}.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value 2023_03_15}
 */
public class TestFrameAndStarter {
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        try{
            final TemperatureConverter tc = new TemperatureConverter();
            //
            tc.printTable();
            
            System.out.printf( "\n\n" );
            System.out.printf( "THIS IS THE END" );
            
        }catch( final Throwable ex ){
            System.out.flush();
            System.err.printf( "###\n" );
            System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
            System.err.printf( "###\n" );
            System.err.printf( "\n" );
            throw( ex );
        }//try
    }//method()
    
}//class

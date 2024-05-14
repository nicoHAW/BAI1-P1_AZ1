package temperatureConverter;


/**
 * TestFrame for Temperature Converter
 * 
 * @author   Michael Schaefers ;  P1@Hamburg-UAS.eu 
 * @version  2017/10/02
 */
public class TestFrame {
    
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

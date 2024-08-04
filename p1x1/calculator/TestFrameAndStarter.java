package calculator;

import java.util.Scanner;

import stuffBeginnersDontHaveToUnderstand.Herald;

public class TestFrameAndStarter {
    
    public static void main( final String... unused ){
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe den ersten Summanden ein\n" );
            System.out.printf( "und tippe danach Return.\n" );
            System.out.printf( "=> " );
            final int addend1st = workAroundForSeriousUserInterface.nextInt();
            //
            System.out.printf( "Gebe den zweiten Summanden ein\n" );
            System.out.printf( "und tippe danach Return.\n" );
            System.out.printf( "=> " );
            final int addend2nd = workAroundForSeriousUserInterface.nextInt();
            
            final Calculator calculator = new Calculator();
            final int sum = calculator.add( addend1st, addend2nd );
            
            System.out.printf( "%d = %d + %d\n",  sum, addend1st, addend2nd );
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                final StringBuilder sb = new StringBuilder( "\n" );
                sb.append( "###\n" );
                sb.append( "### Uuuupppss, was ist denn da passiert ????\n" );
                sb.append( "###\n" );
                Herald.proclaimError( sb );
            }//if
            throw( ex );
        }//try
        
    }//method()
    
}//class

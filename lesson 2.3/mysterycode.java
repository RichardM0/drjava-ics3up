public class mysterycode {
    // The main method demonstrates the seven recursive methods that follow.
    public static void main( String[] args ) {
        System.out.println( mystery1( 5 ) );
        System.out.println( mystery2( "Hello" ) );
        System.out.println( mystery3( "Hello" ) );
        System.out.println( mystery4( " Hello,\n\tHow are  you?" ) );
        System.out.println( mystery5( "this is a test", 's' ) );
        mystery6( 4 ); 	
    }
    
    public static int mystery1( int n ) {
        if ( n == 0 )
            return 0;
        else
            return n + mystery1( n-1 );
    }
    
    public static String mystery2( String w ) {
        if ( w.length() == 1 )
            return w;
        else
            return w.substring(0, 1) + "-" + mystery2( w.substring(1) );
    }
    
    public static String mystery3( String w ) {
        if ( w.length() == 1 )
            return w;
        else
            return mystery3( w.substring(1) )+ w.substring(0,1);
    }
    
    public static String mystery4( String line ) {
        if ( line.length() == 1 )
            return line;
        else if ( Character.isWhitespace(line.charAt(0)) )
            return mystery4( line.substring(1) );
        else
            return line.substring(0,1) + mystery4( line.substring(1) );   	
    }
    
    public static int mystery5( String line, char c ) {
        if ( line.length() == 0 )
            return 0;
        else if ( line.charAt( 0 ) == c )
            return 1 + mystery5( line.substring( 1 ), c );
        else
            return mystery5( line.substring( 1 ), c );
    }
    
    public static void mystery6( int n ) {
        if ( n == 0 )
            System.out.print( "X" );  
        else {
            System.out.print( (n % 2 == 0) ? "/" : "\\" );
            mystery6(n-1);  
            System.out.print( (n % 2 == 0) ? "/" : "\\" );
        }
    }  
    
}

public class booleanEvaluation {
    public static void main( String[] args )
    {
        boolean p = false;
        boolean q = true;
        boolean r = true;
 
        
        System.out.println( p && q || !p && !q );
        System.out.println(p || q&& !p || !q );
        System.out.println( 0 == 1 == true);
        System.out.println( p && (q || r));
        System.out.println( !!p );
        System.out.println( r || ( p || !q || !r && (4 > 3)));

      
    }    
}
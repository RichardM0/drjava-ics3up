public class FancyStuff {
    public static void main( String[] args )
    {
        System.out.printf( "%12s Java\n", "Welcome to" );        
        System.out.printf( "%-12s Java\n", "Welcome to" );        
        System.out.printf( "%3s Java\n", "Welcome to" );        
        System.out.printf( "%.3s Java\n", "Welcome to" );
        System.out.printf( "%3d\n%-3d\n%03d\n", 7, 7, 7 );
        System.out.printf( "%.3f\n%9.3f\n%1.2f\n", 123.94536, 123.94536, 123.94536 );        
    }    
}

// In the first line, it adds whitespace to the beginning of the string
// In the second line, "-" removes the whitespace added to the first. But adds it to the second whitespace.
// In the third line, It properly formats the string.
// In the fourth line, it does everything up to index 3. W is index 0, E is index 1, L is index 2. Index 3 and up is not included.
// In the fifth line, It has 3 lines of output. 
//           The fifth line has 2 spaces of whitespace, done by %3. Each line is created by another \n
//           The sixth line Moves the white space after the first whitespace, so after the 7 done by %-3.
//           The seventh line replaces the first 2 whitespaces with 0, done by %03.
//           From this, I can conclude that in strings, after %, if you have a phrase or sequence with 3 keys, the first key is what you would replace the whitespace with,
//           the second key being the number of spots you would like to replace with (not inclusive), and the third being the datatype replaced with. 

// Along with the sixth line, the eigth line has 3 lines of output as well.
//           The eigth line is rounded to 3 decimals, because of %.3f. and broken into a new line with \n
//           The ninth line is slightly indented due %9, and then rounded to 3 decimals because of .3f.
//           The tenth line rounds to two decimal places because of %1.2f.

// With ints, in %12s, 3 whitespaces are added which is found by 12/3 - 1.
// We can see this in %9s, when 2 whitespaces are added which is also found by 9/3 - 1.

//RESULTS
// Result is:     Welcome to Java.
// Result is: Welcome to    Java
// Result is: Welcome to Java
// Result is: Wel Java
// Result is:  7
//           7
//           007

// Result is: 123.945
//               123.945
//            123.95
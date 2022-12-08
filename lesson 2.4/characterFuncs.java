public class characterFuncs {
    public static void main(String[] args){
        char a = 'e';
        System.out.println("Is " + a + " a digit? " + Character.isDigit(a));
        System.out.println("Is " + a + " a letter? " + Character.isLetter(a));
        System.out.println("Is " + a + " a letter or digit? " + Character.isLetterOrDigit(a));
        System.out.println("Is " + a + " lowercase? " + Character.isLowerCase(a));
        System.out.println("Is " + a + " uppercase? " + Character.isUpperCase(a));
        System.out.println(a + " to lowercase: " + Character.toLowerCase(a));
        System.out.println(a + " to uppercase: " + Character.toUpperCase(a));
    }
}

public class GCD {
    public static void main(String[] args){
        System.out.println(gcd(25, 20));
    }
    public static int gcd(int m, int n){
        if(n!=0){
            return gcd(n, m % n);
        }
        else{
            return m;
        }
    }
}


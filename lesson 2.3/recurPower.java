public class recurPower {
    public static void main(String[] args){
        System.out.println(recursivePower(3, 4));
    }
    public static int recursivePower(int base, int expo){
        if(expo==0){
            return 1;
        }
        if(expo==1){
            return base;
        }
        else{
            return base*recursivePower(base, expo-1);
        }
    }
}

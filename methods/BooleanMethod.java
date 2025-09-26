public class BooleanMethod{
    public static void main(String[] args) {
        System.out.println(check(1111));
         System.out.println(prime(27));
         System.out.println(doubledigit("13"));


    }

    
    public static boolean check(int x) {
        return x % 2 == 0;
    }
   // only printing the booleans if they are prime number

    public static boolean prime(int x){
    
    for(int i = 2;i<x/2; i++){
        if (x%i != 0){
            return true;
        }
    }
    return false;
    }



    private static boolean doubledigit(String x){
        return x.length()==2;
        
    }
}
///
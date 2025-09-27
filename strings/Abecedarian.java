public class Abecedarian{
    public static void main(String[] args) {
        System.out.println(isAbecedarian("abc"));

    }

    public static boolean isAbecedarian(String b){
        String a = b.toLowerCase();
        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)>a.charAt(i+1)){
                return false;
            }
        }
        
        return true;

    }
}
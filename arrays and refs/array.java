
public class array {

    public static void main(String[] args) {
        int[] a= {1,2,4,5,6};
        System.out.println(a);
        printArray(a);
        
    }

    public static void printArray(int[] a){
        for(int i = 0;i<a.length;i++){
                System.out.print("{"+a[i]+"}");
        }
        // System.out.println("");
    }
    
}

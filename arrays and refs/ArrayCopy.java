

public class ArrayCopy {
public static void main(String[] args) {
    int[] a =new int[5];
    int[] b = a;

    b[2] = 1;
    a[0] = 89;

    for(int i = 0;i<5;i++){
        System.out.println(a[i]);
    }
            System.out.println("++++++++++++++++++++++");
    for(int i = 0;i<5;i++){
        System.out.println(b[i]);
    }
}    
}

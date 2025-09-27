import java.util.Arrays;

public class Tostring {
    public static void main(String[] args) {
        int[] a = {2,3,456,5,4,3,23,45,65,43};

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

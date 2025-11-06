package randoms;

import java.util.Arrays;

public class Args {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<args.length;i++){
            int value = Integer.parseInt(args[i]);

            if(value>max){
                max = value;
            }

        }
        System.out.println(Arrays.toString(args));
        System.out.println(max);
    }
}

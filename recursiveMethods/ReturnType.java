package recursiveMethods;


// given task to find thhe factorial of a number using recursion
public class ReturnType {
    public static void main(String[] args) {
        System.out.println(returnFactoral(6));
    }

    public static int returnFactoral(int n) {
    if(n==0){
        return 1;

    }
        int temp = returnFactoral(n-1);
        int recur = temp * n;
        return recur;

    }
}

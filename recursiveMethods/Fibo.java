    package recursiveMethods;


    // to find the fubhonacci recursively
    public class Fibo {
        public static void main(String[] args) {
            System.out.println(fibo(6));
        }
        //upto nth terms
        static int fibo(int n){

           if(n==0){
            return 0;
           }
           if(n==1){
               return 1;
           }
           int temp = fibo(n-1);

            return fibo(n-2) + temp;
        }
    }

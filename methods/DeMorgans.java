public class DeMorgans {
 public static void main(String[] args) {
    d1(0,0);
    d1(2, 4);
 }   

 static void d1(int a , int b){

    if(a==0&&b==0){
        System.out.println("Both are 0");
    }
    else if(!(a==0||b==0)){
        System.out.println("De Morgan second");
    }
    // negating a logical expression is equivalent to negating each term and negating the operator
 }
}

public class Multiadd {
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    //sin and cos functions
    public static double multadd(){
        double sum =  Math.sin((Math.PI)/4) + (Math.cos(Math.PI/4))/4;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd());
    }



    //xe−x + 1 − e−x
   public static double expSum(double x) {
    double sum = x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    return sum;
}

}

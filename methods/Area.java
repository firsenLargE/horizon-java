public class Area {
    public static void main(String[] args) {
        Double diameter = 20.5;
        System.out.println(area(diameter/2));
    }

    static double area(double r){

        return Math.PI * r*r;

    }
}

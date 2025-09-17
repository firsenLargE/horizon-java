public class Distance {
    public static void main(String[] args) {
        System.out.println("Distance:" + dist(2, 3, 6, 7));

    }

    static double dist(double x1, double x2, double y1, double y2) {
        // implementation of distance formula
        double dx = x1 - x2;
        double dy = y1 - y2;
        // double squared = Math.pow(dy, 2) + Math.pow(dx,2);
        // System.out.println(squared);
        // return 0.0; // stub

        double distance = Math.pow((Math.pow(dy, 2) + Math.pow(dx, 2)), 0.5);
        return  distance;
    }

}

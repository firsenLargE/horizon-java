package randoms;
import java.awt.Rectangle;

public class Rectangles {


    static void main(String[] args) {
        Rectangle r = new Rectangle(0,0,100,200);
        Rectangle r1 = r;
        r1.grow(40,40);   //proof for mutalble objects
        System.out.println(r);
        System.out.println(r1);


    }
}

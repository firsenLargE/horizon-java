public class Flow {
    public static void main(String[] args) {
        zippo("rattle", 13);
    }
public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
            System.out.println(1);
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }
    public static void baffle(String blimp) {
        System.out.println(blimp);
        // zippo("ping", 12);
        System.out.println(2);
    }

    
}

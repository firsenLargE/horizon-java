
import java.time.LocalDate;

//to print date in iso format

public class ISO {
    public static void main(String[] args) {
        date();
    }

    static void date() {
        LocalDate d = LocalDate.now();
        System.out.println(d);
    }

}

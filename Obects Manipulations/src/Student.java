public class Class {
    String name;
    int roll_no;

    Class(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    public String returnData(){

        return name+":"+roll_no;
    }
}

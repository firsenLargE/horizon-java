
public class datetimeformat {
    public static void main(String[] args) {
        System.out.println(returnTime(00,20));
    }
public static String returnTime(int hour,int mintes){
    String ampm;
    if(hour<12){
        ampm = "AM";
        if(hour==00){
            hour=12 ;

        }
    

    }
    else{
        ampm = "PM";
        hour = hour-12;
    }

return String.format("%02d:%02d %s", hour,mintes , ampm);
}
  
}

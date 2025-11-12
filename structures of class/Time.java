

public class Time{
    private int hour = 0 ;
    private int min =0;
    private int sec =0;

    public Time(){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    static void main(String[] args) {
        Time t = new Time();
        System.out.println(t);
    }


}
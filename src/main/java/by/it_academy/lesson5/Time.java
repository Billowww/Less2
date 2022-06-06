package by.it_academy.lesson5;

public class Time {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totalOfSeconds) {
        this(totalOfSeconds / (60 * 60) ,totalOfSeconds % 3600/60,totalOfSeconds % 60);

    }
    public int totalSeconds(){
        int result = seconds;
        result+=minutes*60;
        result+=hours*3600;
        return result;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;

    }
public boolean isBefore(Time time){
        return  this.totalSeconds()< time.totalSeconds();

        }


    public static void main(String[] args) {
        Time time1=  new Time(15,2,30);
        Time time2 = new Time(3690);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time1.totalSeconds());
        System.out.println(time2.totalSeconds());
        System.out.println(time1.isBefore(time2));
    }
}

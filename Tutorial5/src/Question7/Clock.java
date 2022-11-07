package Question7;

import java.time.LocalTime;

public class Clock {

    int hours;
    int minutes;

    Clock (){
        this.hours = 30;
        this.minutes = 70;
    }

    public String getHours (){
        String hours;
        hours = String.valueOf(LocalTime.now().getHour());
        return hours;
    }

    public String getMinutes (){
        String minutes;
        minutes = String.valueOf(LocalTime.now().getMinute());
        return minutes;
    }

    public String getTime (){
        String time;
        time = getHours() + ":" + getMinutes();
        //return time;

        if(this.hours <= Integer.parseInt(this.getHours()) && this.minutes <= Integer.parseInt(this.getMinutes())){
            this.hours = 30;
            this.minutes = 70;
            return "Alarm " + time;
        }
        return time;
    }

    public void setAlarm(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
}

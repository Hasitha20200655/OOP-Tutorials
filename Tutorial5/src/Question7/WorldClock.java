package Question7;

import java.time.LocalTime;

public class WorldClock extends Clock{

    int zones;
    WorldClock(int zones){
        this.zones = zones;
    }

    @Override
    public String getHours() {
        int hours = LocalTime.now().getHour();
        hours = hours + 3;
        return String.valueOf(hours);
    }
}

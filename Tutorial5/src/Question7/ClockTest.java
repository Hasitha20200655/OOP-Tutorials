package Question7;

public class ClockTest {
    public static void main(String[] args) {
        Clock c1 = new Clock();

        System.out.println(c1.getHours());
        System.out.println(c1.getMinutes());

        c1.setAlarm(16, 7);
        System.out.println(c1.getTime());

        Clock c2 = new WorldClock(3);
        System.out.println(c2.getTime());
    }
}

package Question9;

public class Daliy extends Appointment{
    public Daliy(int date) {
        super(date);
    }

    @Override
    public boolean occursOn(int year, int month, int day) {
        return false;
    }
}

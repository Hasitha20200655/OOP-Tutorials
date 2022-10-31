package Question9;

public class Monthly extends Appointment{

    public Monthly(int date) {
        super(date);
    }

    @Override
    public boolean occursOn(int year, int month, int day) {
        return false;
    }
}

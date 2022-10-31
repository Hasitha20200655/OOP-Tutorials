package Question9;

public abstract class Appointment {
    int date;

    public Appointment(int date){
        this.date = date;
    }

    public abstract boolean occursOn(int year, int month, int day);
}

package Question5_and_Question6;

import java.time.Year;

public class DriverLicense extends Card {

    private int expirationYear;

    public DriverLicense(String name, int expirationYear) {
        super(name);
        this.expirationYear = expirationYear;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isExpired(){
        Year year = Year.now();
        Year expired = Year.of(expirationYear);

        if(year.compareTo(expired) < 0){
            return false;
        }
        else {
            return true;
        }
    }

    //Question 6 override part
    @Override
    public String format(){
        return super.format() + "\nExpiration Year " + expirationYear;
    }
}

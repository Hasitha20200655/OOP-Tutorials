package Question5_and_Question6;

import java.time.Year;

public class Passport extends Card{

    private String birthLocation;
    private int expirationYear;

    //constructor
    public Passport(String name, String birthLocation, int expirationYear){

        super(name);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    public void setBirthLocation(String birthLocation){
        this.birthLocation = birthLocation;
    }

    public void setExpirationYear(int expirationYear){
        this.expirationYear = expirationYear;
    }

    public String getBirthLocation(){
        return birthLocation;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    //abstract method in the abstract class is override
    @Override
    public boolean isExpired() {
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
    public String format() {
        return super.format() + "\nBirth Location " + birthLocation + "\nExpiration Year " + expirationYear;
    }
}

package Question5_and_Question6;

public class CreditCard extends Card{

    private int pinNumber;
    private int number;

    //Constructor
    public CreditCard(String name, int pinNumber, int number){

        super(name);
        this.pinNumber = pinNumber;
        this.number = number;
    }
    //set pin number of the card
    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }
    //Set the number of the card
    public void setNumber(int number){
        this.number = number;
    }

    public int getPinNumber(){
        return pinNumber;
    }
    public int getNumber(){
        return number;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    //Question 6 override part
    @Override
    public String format(){
        return super.format() + "\nCard Number " + number;
    }

}
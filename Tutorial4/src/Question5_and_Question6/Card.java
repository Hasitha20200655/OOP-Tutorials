package Question5_and_Question6;

public abstract class Card {

    private String name;

    //constructors
    public Card(){
        name = "";
    }

    public Card(String name){
        this.name = name;
    }


    //set name
    public void setName(String name){
        this.name = name;
    }
    //get name
    public String getName(){
        return name;
    }
    // abstract class
    public abstract boolean isExpired();
    //return format
    public String format(){
        return "Card holder " + name;
    }
}

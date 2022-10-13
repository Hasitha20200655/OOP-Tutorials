package Tutorial2;

public class VendingMachine {
    private int numberOfCans;
    private int numberOfTokens;

    public VendingMachine(){
        this.numberOfCans = 0;
        this.numberOfTokens = 0;
    }

    public void fillUp(int cans){
        numberOfCans += cans;
    }

    public void insertToken()
    {
        if(numberOfCans > 0){
            System.out.println("Sorry for the inconvenience Vending Machine is Empty please try again later");
        }
        else {
            numberOfTokens++;
            numberOfCans--;
        }
    }

    public int getCanCount(){
        return numberOfCans;
    }

    public int getTokenCount(){
        return numberOfTokens;
    }
}

package Question3;

public class BankAccount implements Comparable<BankAccount>{

    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        if(this.balance == o.balance){
            return 0;
        }
        else if(this.balance > o.balance){
            return 1;
        }
        else if(this.balance < o.balance){
            return -1;
        }
        return 401;
    }
}

package Question4;

import java.util.Comparator;

public class SortBalance implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount ac1, BankAccount ac2) {
            double balance1 = ac1.getBalance();
            double balance2 = ac2.getBalance();

            if(balance1 == balance2){
                return 0;
            }
            else if(balance1 > balance2){
                return 1;
            }
            else if(balance1 < balance2){
                return -1;
            }
            return 401;
        }
}

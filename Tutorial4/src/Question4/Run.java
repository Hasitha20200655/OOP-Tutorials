package Question4;

import java.util.ArrayList;
import java.util.Collections;

public class Run {

    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount(3000);
        BankAccount ac2 = new BankAccount(2000);
        BankAccount ac3 = new BankAccount(5000);

        SortBalance sb = new SortBalance();

        System.out.println(sb.compare(ac1,ac2));
        System.out.println(sb.compare(ac2,ac3));

        System.out.println();

        // put bank accounts into a list
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(ac1);
        list.add(ac2);
        list.add(ac3);

        // call the library sort method
        Collections.sort(list, new SortBalance());

        // print out the sorted list
        for (BankAccount b : list){
            System.out.println(b.getBalance());}
    }
}

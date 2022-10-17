package Tutorial1;

import java.util.Arrays;
import java.util.Random;

public class Question6 {
    public void run(){

        System.out.println("\nQuestion 6\n");

        int [] luckyNumber = new int[6];

        for(int i = 0; i < luckyNumber.length; i++){
            Random rand = new Random();
            boolean isUnique = false;
            int x = 0;
            while(!isUnique){
                x = rand.nextInt(2,49);
//            int x = (int)(Math.random() *(48+1));
                for (int num: luckyNumber) {
                    if (num != x){
                        isUnique = true;
                    } else if (num == x) {
                        isUnique = false;
                        break;
                    }
                }
            }

            luckyNumber[i] = x;

        }

        System.out.println(Arrays.toString(luckyNumber));
    }

}

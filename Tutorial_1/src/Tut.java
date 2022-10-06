import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tut {
    public static void main (String [] args){
        System.out.println("Welcome to Online Learning!\n\nPlease virus go away!\n");

        for(int i = 1; i < 100; i ++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        int z = 2;
        while (z < 100){
            System.out.println(z);
            z += 2;
        }

        lottery();

    }
    public static void lottery(){
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

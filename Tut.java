public class Tut {
    public static void main (String [] args){
        System.out.println("Welcome to Online Learning!\n\nPlease virus go away!\n");

        for(int i = 1; i < 100; i ++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        int i = 2;
        while (i < 100){
            System.out.println(i);
            i += 2;
        }

        int [] luckyNumber = new int[6]

        for(int i = 0; i < luckyNumber.length; i++){
            int x = 0;
            x = (int)(Math.random() *(48+1));
            System.out.println("num "+i+": "+x);
        }
    }
}

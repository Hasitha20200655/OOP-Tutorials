package Question1;

public class CalcManager {
    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static int cube(int n){
        int cube = n*n*n;
        return cube;
    }

    public static double add(double ... x){
        double total = 0;
        for (double num: x) {
            total = total + num;
        }
        return total;
    }
}

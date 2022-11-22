package Question1;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        int [] array1 = {7};
        int [] array2 = {3,6};
        int [] array3 = {4,6,8};
        int [] array4 = {1,2,3,4};
        int [] array5 = {8,4,2,0,4};

        loadArray(array1);
        loadArray(array2);
        loadArray(array3);
        loadArray(array4);
        loadArray(array5);

        System.out.println(Arrays.toString(array1)); //[7]
        System.out.println(Arrays.toString(array2)); //[3, 9]
        System.out.println(Arrays.toString(array3)); //[4, 10, 18]
        System.out.println(Arrays.toString(array4)); //[1, 3, 6, 10]
        System.out.println(Arrays.toString(array5)); //[8, 12, 14, 14, 18]
    }

    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
        }
    }
}

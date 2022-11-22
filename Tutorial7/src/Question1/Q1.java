package Question1;

public class Q1 {
    public static void main(String[] args) {

        int [] array1 = new int[]{7};
        int [] array2 = new int[]{3,6};
        int [] array3 = new int[]{4,6,8};
        int [] array4 = new int[]{1,2,3,4};
        int [] array5 = new int[]{8,4,2,0,4};

        loadArray(array1);
        loadArray(array2);
        loadArray(array3);
        loadArray(array4);
        loadArray(array5);
    }

    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
        }
    }
}

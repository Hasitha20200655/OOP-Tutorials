package Question5;


import java.util.Arrays;

public class ArrayMissing {
    public static void main(String[] args) {

    }

    public int [] sortArray(int [] arr){
        int [] array = arr;
        Arrays.sort(array);
        return array;
    }

    public int findMissingNum(int [] arr){
        int missing = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i+1] != arr[i]+1){
                missing = arr[i]+1;
            }
        }
        return missing;
    }

    public int findRepeatingNum(int [] arr){
        int repeating = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i+1]){
                repeating = arr[i];
            }
        }
        return repeating;
    }
}

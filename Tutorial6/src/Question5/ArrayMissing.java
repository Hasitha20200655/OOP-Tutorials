package Question5;


import java.util.Arrays;

public class ArrayMissing {
    public static void main(String[] args) {

        int [] array1 = {9,8,5,2,3,1,5,4,7};

        findToNumbs(array1);
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

    public void findToNumbs(int[] arr){

        sortArray(arr);
        int missing = findMissingNum(arr);
        int repeating = findRepeatingNum(arr);

        System.out.println("Missing number : " + missing);
        System.out.println("Repeating number : " + repeating);
    }
}

package Question5;


import java.util.Arrays;

public class ArrayMissing {

    public int [] sortArray(int [] arr){
        //int [] array = arr;
        Arrays.sort(arr);
        return arr;
    }

    public int findMissingNum(int [] arr){
        int missing = 0;
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i+1] != arr[i]+1){
                missing = arr[i]+1;
            }
        }
        return missing;
    }

    public int findRepeatingNum(int [] arr){
        int repeating = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                repeating = arr[i];
            }
        }
        return repeating;
    }

    public void findToNumbs(int[] arr){

        int [] arrayCopy = sortArray(arr);
        int missing = findMissingNum(arrayCopy);
        int repeating = findRepeatingNum(arrayCopy);

        System.out.println("Missing number : " + missing);
        System.out.println("Repeating number : " + repeating);
    }
}

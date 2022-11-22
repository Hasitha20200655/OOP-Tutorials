package Question2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(5,10,15));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(8,2,8,7,4));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(-1,3,28,17,9,30));


        listDemo(list1);
        listDemo(list2);
        listDemo(list3);
    }

    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }
}

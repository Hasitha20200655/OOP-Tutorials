package Question4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ContainerTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(3.4);
        list.add(Integer.valueOf(4));

        Book myBook = new Book();
        list.add(myBook);

        double d;
//      d = list.get(0);  required type is double provided type is double (compile time error)
        d = (double) list.get(0);
        //Double d2 = (Integer) list.get(1); ClassCastException(Run time error) cannot cast integer type to double type
        Integer d2 = (Integer) list.get(1);
//      Book b3 = (Book) list.get(1); ClassCastException(Run time error) Can not cast integer type to book type
        Integer b3 = (Integer) list.get(1);
        Book b2 = (Book) list.get(2);

//        System.out.println(d+" " + d2 +" "+b3 + " " + b2);
    }
}

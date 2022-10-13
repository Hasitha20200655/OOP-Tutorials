package Tutorial2;

import java.awt.Rectangle;


public class Question3 {

    public void run() {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = new Rectangle(0, 0, 100, 50);
//      You can use this because using same parameters Rectangle r2 = new Rectangle(r1);
        r2.grow(10, 20);

        System.out.println(r1);
        System.out.println(r2);
    }

    public void run2() {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = r1;
//      You can use this because using same parameters Rectangle r2 = new Rectangle(r1);
        r2.grow(10, 20);

        System.out.println(r1);
        System.out.println(r2);

        /* The output is
        * java.awt.Rectangle[x=-10,y=-20,width=120,height=90]
          java.awt.Rectangle[x=-10,y=-20,width=120,height=90]

        * Because This is and object and object are reference type and mutable
        * when you assign to new object it shows the same object assigned not a new one  */
    }

    public void run3() {
        double n1 = 150;
        double n2 = n1;

        n2 = n2 * 20;

        System.out.println(n1);
        System.out.println(n2);

        /*The out put is
        * 150.0
        * 3000.0
        * Because these are premetive type and immutable
        * sot second variable shows a new value */
    }

}

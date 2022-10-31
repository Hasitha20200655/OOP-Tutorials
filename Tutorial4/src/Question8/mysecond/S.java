package Question8.mysecond;

import Question8.myfirst.P;

public class S extends P {
    public void bar() {
        x = 2.5; // line 8
        y = 3.5; // line 9
        z = 4.5; // line 10
        w = 5.5; // line 11

        P p4 = new P();
        p4.x = 2.5; // line 14
        p4.y = 3.5; // line 15
        p4.z = 4.5; // line 16
        p4.w = 5.5; // line 17
    }
}

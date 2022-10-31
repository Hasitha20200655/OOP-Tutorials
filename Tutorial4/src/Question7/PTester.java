package Question7;

public class PTester {
    public static void main(String[] args) {
        A a1 = new A();
        a1.print();

        a1 = new B();
        a1.print();

        a1 = new C();
        a1.print();

        a1 = new D();
        a1.print();

        B b1 = new D();
        b1.print();

        D d1 = (D) b1;  // cast line 1
        d1.print();

        /* cast line 1 - b1 is a Class D object with Class type B to pass b1 to Class type D object we need to
         change the type of the class to from Class type B TO Class type D (Type D object need Type D object) [for example
         int can be passed to int type variables only]*/

        A  a2 = new A();
        d1 = (D) a2;     // cast line 2  (Class A object can not be cast to class D type it will cause a ClassCastException )
        d1.print();

        // Can not cast a super class object to subclass object it will cause a ClassCastException
    }
}

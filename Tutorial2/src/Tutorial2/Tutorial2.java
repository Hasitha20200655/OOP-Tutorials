package Tutorial2;

public class Tutorial2 {
    public static void main (String [] args){
        Question1 question1  = new Question1();
        Question2 question2  = new Question2();
        Question3 question3  = new Question3();
        VendingMachineTester Test1 = new VendingMachineTester();

        question1.run();
        question2.run();
        System.out.println();
        question3.run();
        System.out.println();
        question3.run2();
        System.out.println();
        question3.run3();
        System.out.println();
        Test1.run();
    }
}

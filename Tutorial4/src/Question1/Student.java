package Question1;

import java.lang.reflect.Array;

public class Student implements Printable{
    String name;
    String [] grades = new String [5];

    public Student(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Name : " + name);
        System.out.println("Marks : \n");
        for (String grade: grades) {
            System.out.println(grade);
        }
    }
}

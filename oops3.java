// constructors
import java.util.*;
public class oops3{
    public static void main(String args[]){
       //object creations using a constructor named student
       Student s1 = new Student("jiya ",24);
       System.out.println(s1.name+"\n"+s1.roll);
    }
}
class Student{
    String name;
    int roll;

    //constructor initialisation // constructors are special methods
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}
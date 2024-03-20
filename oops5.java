// constructors 
//problem - deep & shallow copy
import java.util.*;
public class oops4{
    public static void main(String args[]){
       //object creations using a constructor named student
       Student s1 = new Student();
       s1.name="jiya";
       s1.roll = 123;
       s1.password = "abc";
       s1.marks[0]= 100;
       s1.marks[1]= 90;
       s1.marks[2]= 80;

       Student s2 = new Student(s1);
       s2.password = "xyz";
       //System.out.println(s1.name+"\n"+s1.roll);
       s1.marks[2] =10;
       for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
       }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //constructor initialisation 
    // constructors are special methods
    Student (){
        marks = new int[3];
    }
    //copy constructor
    //shallow copy
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy - o/p  no change
    Student (Student s1){
        marks = new int[3];
        this.roll = s1.roll;
        this.name = s1.name;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}
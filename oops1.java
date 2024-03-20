//classes and objects
import java.util.*;
public class oops1{
    public static void main(String args[]){
      // creating object named p1 for the class Pen in order to occupy memory in heap
      Pen p1 = new Pen();// this is syntax of crating an obj ( also called constructor)
      p1.setcolour("black");
      System.out.println(p1.colour);
      p1.settip(5);
      System.out.println(p1.tip);
      p1.colour="yellow";
      System.out.println(p1.colour);
    }

}

class Pen{
    // attributes
    String colour;
    int tip;
    // methods
    void setcolour(String newcolour){
        colour = newcolour;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
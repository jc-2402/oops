//classes and objects
import java.util.*;
public class oops2{
    public static void main(String args[]){
      // creating object named p1 for the class Pen in order to occupy memory in heap
      Pen p1 = new Pen();// this is syntax of crating an obj ( also called constructor)
      p1.setcolour("black");
      System.out.println(p1.getcolour());
      p1.settip(5);
      System.out.println(p1.gettip());
      p1.setcolour("yellow");
      System.out.println(p1.getcolour());
    }

}

class Pen{
    // attributes
    private String colour;
    private int tip;
    //setters
    String getcolour(){
        return this.colour;
    }
    int gettip(){
        return this.tip;
    }
    // getters
    void setcolour(String newcolour){
        this.colour = newcolour;
    }
    void settip(int newtip){
        this.tip = newtip;
    }
}
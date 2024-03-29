//abstract classes
public class oops11{
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animals{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animals{
    void walk(){
        System.out.println("has 4 legs and was 2 faced");
    }
}
class Chicken extends Animals{
    void walk(){
        System.out.println("has 2 legs");
    }
}

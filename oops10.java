//method overriding
public class oops10{
    public static void main(String args[]){
     // creating object of dear ... then eats of dear is called only a/c to overriding
     Dear d = new Dear();
     d.eats();
    }
}
class Animals {
    void eats(){
        System.out.println("eats anything");
    }
}
class Dear extends Animals{
    void eats(){
        System.out.println("eats grass");
    }
}
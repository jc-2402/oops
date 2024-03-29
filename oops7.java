// inheritance
public class oops7{
    public static void main(String args[]){
     Dogs doggy = new Dogs();
     doggy.eats();
     doggy.legs = 4;
    System.out.println(doggy.legs);
     doggy.breed = "labra";
      System.out.println(doggy.breed);
    }
}
//parent class
class Animals{
    String colour;
    void eats(){
        System.out.println("khana do bc!");
    }
    void breathe(){
        System.out.println("saas leta hue bhai!");
    }
}
//child class
class mammals extends Animals{
    int legs;
}
//grand child
class Dogs extends mammals{
    String breed;
}

// inheritance
public class oops6{
    public static void main(String args[]){
    Fish shark = new Fish();
    //shark.swims();
    shark.eats();
    }
}
//parent class
public class Animals{
    String colour;
    void eats(){
        System.out.println("khana do bc!");
    }
    void breathe(){
        System.out.println("saas leta hue bhai!");
    }
}
//child class
public class Fish extends Animals{
    int fins;
    void swims(){
        System.out.println("swimmingggggg");
    }
}
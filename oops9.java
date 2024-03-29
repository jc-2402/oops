//method overloading
//1 class, same method name , different parameters
public class oops9{
    public static void main(String args[]){
      Calculator cal = new Calculator();
      System.out.println(cal.sum(2,3));
      System.out.println(cal.sum((float)2.5,(float)3.5));
      System.out.println(cal.sum(2,3,5));
    }
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
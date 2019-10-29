package Latihan3;
public class Gajah extends Hewan{
    public static void testClassMethod() {
        System.out.println("The class method in hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod(){
        System.out.println("The instance method in Gajah...");  
    }
    public static void main(String[] args) {
        Gajah mygajah = new Gajah();
        Hewan myHewan = mygajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
    
}

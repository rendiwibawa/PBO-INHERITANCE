package Latihan1;
public class pertama {
    private int a=10;
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");   
    }
    public void info(){
        System.out.println("a ="+a);
        System.out.println("Di panggil pada ="+this.getClass().getName());
    }
}

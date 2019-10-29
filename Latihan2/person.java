package Latihan2;
public class person {
private String nama;
private int usia;

//Konstruktor
public person (String nama,int usia){
    this.nama =nama;
    this.usia =usia;
}
//Methode
public void info(){

    System.out.println("-=Nama :"+this.nama);
    System.out.println("-=Usia :"+this.usia);
     System.out.println("=============================");
}
}

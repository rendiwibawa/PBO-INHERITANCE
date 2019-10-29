package Latihan4;
public class B extends A{
    private int b;
    public void setB(int nilai){
        b = nilai;
    }
    public int getB(){
        return b;
    }
    //melakukan override terhadab method tampilankanNilai()
    //ini yang terdapat pada kelas A
    
    public void tampilkanNilai(){
        super.tampilkanNilai();//memanggil method dalam kelas A
        System.out.println("Nilai b : "+getB());
    }
}

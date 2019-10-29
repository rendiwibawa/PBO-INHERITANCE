package Latihan2 ;

class Empoly extends person
{
    private String noKaryawan;
    
    public Empoly(String noKaryawan,String nama, int usia) {
        super(nama, usia);
        this.noKaryawan=noKaryawan;
    }
    //Metode
    public void info(){
        System.out.println("=============================");
        System.out.println("-=No. Karyawan :"+this.noKaryawan);
    super.info();
    }
}
    


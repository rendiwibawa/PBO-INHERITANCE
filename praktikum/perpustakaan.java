package praktikum;
public class perpustakaan {
   private String buku;
   private int nomerbuk;
   
   public perpustakaan (String buku,int nomerbuk){
   this.buku = buku;
   this.nomerbuk = nomerbuk;
   }
   
   public void info (){
       System.out.println("-=Nama buku :"+this.buku);
       System.out.println("-=Nomer buku:"+this.nomerbuk);
          System.out.println("=======---Thanks---=======");
   }


}



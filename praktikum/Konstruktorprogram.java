package praktikum;
import java.util.Scanner;
public class Konstruktorprogram {
    public static void main(String[] args) {
        
        int pilihan = 0;
        
        String jwb;
        int counter = 0;
        boolean ulang=true;
        while(ulang){
            
            
            
            System.out.println("======-----SCRIPT PROGRAM by:-----======");
            System.out.print
(" __  __        ____                _  _\n" +
"|  \\/  |_ _   |  _  \\ __ _ _     _| |(_)\n" +
"| |\\/| | '_|  | |_) / _ \\ '_ \\ / _` || |\n" +
"| |  | | |    |  _ <  _ / | | | (_| || |\n" +
"|_|  |_|_| () |_| \\_\\_ _|_| |_|\\____||_|\n");
            System.out.println("=======----==-----======-----==----======\n");
            
            
            
            
        System.out.println("---====PERPUSTAKAAN TELKOM====---");
        System.out.println("-=Berikut dat buku yang ada :\n1.Sejarah\n2.Hacking Web\n3.Cara ternak lele\n4.Cara Sulap\n5.Cara Cepat kaya\n===========---Pilih----===========");
        Scanner ren = new Scanner (System.in);
        pilihan = ren.nextInt();
            
 
        if (pilihan==1){
        tambahan start= new tambahan("Sejarah", 12313,3);
        start.info();}
        else {if(pilihan==2){tambahan start= new tambahan("Hacking Web", 346624,4);
        start.info();}
        else {if(pilihan==3){tambahan start= new tambahan("Cara ternak lele", 23431,7);
        start.info();}
        else {if(pilihan==4){tambahan start= new tambahan("Cara Sulap", 176412,2);
        start.info();}
        else {if(pilihan==5){tambahan start= new tambahan("Cara Cepat kaya", 122313,6);
        start.info();}
        if(pilihan>5){System.err.println("==----MOHON MAAF PILIHAN TIDAK TERSEDIA----==");
        }}}}}
         
        
        System.out.println("APAKAH ANDA INGIN MENGANTINYA (y/t)");
        jwb=ren.next();
         if(jwb.equalsIgnoreCase("t"))
            ulang=false;
            System.out.println("=============Thanks==============");
        }counter++;
}
    

    
}

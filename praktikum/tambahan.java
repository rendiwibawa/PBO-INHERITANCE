package praktikum;
class tambahan extends perpustakaan
{
private int Urutan;
    public tambahan(String buku, int nomerbuk,int urutan) {
        super(buku, nomerbuk);
        this.Urutan=urutan;
    }
    public void info(){
        System.out.println("==========hasil===========");
        System.out.println("-=Letak buku di rak: "+this.Urutan);
        super.info();
} 
    
}

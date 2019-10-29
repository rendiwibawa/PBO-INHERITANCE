package Latihan5;
public class MountainTruck extends Truck
{
//mountain truck subclass tambahkan satu field
    public int seatHaight;
    //subclass memiliki satu constructors
    public MountainTruck(int startCadance, int startSpeed, int staratGear) {
        super(startCadance, startSpeed, staratGear);
        seatHaight = seatHaight;
    }
    //tambahkan method
    public void setHeight(int newValue){
        seatHaight = newValue;
    }
    public static void main(String[] rendi) {
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0);
        System.out.println("gear = "+ MB.gear);
        System.out.println("Speed = "+ MB.speed);
        MB.setGear(2);
        MB.speedUP(2);
        System.out.println("Gear = "+MB.gear);
        System.out.println("Speed = "+MB.speed);
        MB.speedUP(2);
        System.out.println("Gear = "+MB.gear);
        System.out.println("Speed = "+MB.speed);
    }
}

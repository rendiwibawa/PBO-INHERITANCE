package Latihan5;
public class Truck {
    //truck class memiliki bidang 
    public int cadance;
    public int gear;
    public int speed;
    //truck class memiliki satu construktor
    public Truck(int startCadance, int startSpeed ,int staratGear){
    gear= staratGear;
    cadance= startCadance;
    speed = startSpeed;
    }
    //class truck memiliki 4 methods
    public void setCadence (int newValue){
    cadance = newValue;
    }
    public void setGear (int newValue){
        gear= newValue;
    }
    public void applybrake (int decrement){
        speed= decrement;
    }
    public void speedUP(int increment){
        speed=increment;
    }
}

package thecarrental;


public class Truck extends Vehicle {
    boolean hasTrailer = false;
    
    Truck(String TruckColor,boolean hasTrail){
        this.color = TruckColor;
        hasTrailer = hasTrail;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" has Trailer: "+hasTrailer;
    }
}

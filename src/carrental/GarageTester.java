package thecarrental;


public class GarageTester {
    public String getExample(){
        Truck tr = new Truck("Black",false);

        Garage gr = new Garage();
        return gr.setVehicle(tr);
    }
}

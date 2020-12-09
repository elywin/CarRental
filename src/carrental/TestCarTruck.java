package thecarrental;


public class TestCarTruck {

    public static void main(String[] args) {
        
        Vehicle bencarr = new Car("blue",true);
        Vehicle petetruck = new Truck("Orange",true);
        
        
      //  System.out.println(bencar.toString());
        System.out.println(petetruck.toString());
        
        
        GarageTester gt = new GarageTester();
        System.out.println("Garage Tester: "+gt.getExample());
        
        Customer nc3 = new Customer("joel","Kawolo");
       // Customer nc2 = new Customer("Kinobe","Toronto");
        
       // Vehicle chevroletCar = new Car("Purple",true);
        
       CarRentalContract cc4 = new CarRentalContract(nc3,bencarr);
       // CarRentalContract cc3 = new CarRentalContract(nc2,chevroletCar);
        
        CarRental cd = new CarRental();
       // cr.addContract(cc3);
       cd.addContract(cc4);
        
//        for (int i=1; i<=CarRental.rentObjects; i++){
//            System.out.println(cr.displayContracts());
//        }

        System.out.println("My Contracts:");
        System.out.println(cd.displayContracts());
        
    
    }
    
}

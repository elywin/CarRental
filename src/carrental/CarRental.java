/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

/**
 *
 * @author Elywin
 */

class Vehicle{
    String color = "red";
    public void getColor(){
        System.out.println(toString());
    }
    
     public String toString(){
     
        return "This vehicle is "+color;
    }
}

class Car extends Vehicle{
    boolean winterTyers;
    
   public void get_car(){
       System.out.println("This vehicle"+" "+toString());
   }
     public String toString(){
     
        return "has winter tires: "+winterTyers;
    }
}


class Truck extends Vehicle{
    boolean hasTrailer;
    public void getTruck(){
        System.out.println("This vehicle is "+color+" "+toString());
    }
     public String toString(){
     
        return "has trailer: "+hasTrailer;
    }
}

class Garage {
   
   Vehicle n = new Car();
   Vehicle t = new Truck();
   // boolean parked=true;
    public void setVehicle(Vehicle parked){
        
        System.out.println(parked.toString());
                

    }
    public String toString(){
     
        return "This vehicle is "+n.color+"has winter tyres: "+n.toString()+"has trailer: "+t.toString();
    }
    
}

class GarageTester{
   
    public void getExample(){
      
        Truck t = new Truck();
        t.color="black";
        t.hasTrailer=false;
       
        Garage g = new Garage();
       
       g.setVehicle(t);
    }
}

class Customer{
 
  String name = "Elywin Michael";
  String address = "Mukono";
}

//CarRentalContract
class CarRentalContract{
      Customer cus = new Customer();
        Vehicle c = new Car();
        Vehicle t = new Truck();
    public void carRented(){
    System.out.println(toString());
}
      public String toString(){
          
     String[] myarr= new String[2];
     for(int i=0;i<myarr.length;i++){
          myarr[i]=cus.name+":This vehicle is "+c.color+", "+c.toString();
        // myarr[i]=cus.name+":This vehicle is "+c.color+", "+c.toString()+" "+t.toString();
     }
     for(String a:myarr){
       System.out.println(a);
     }
        return "";
    }
}
//CarRental class
public class CarRental {
    CarRentalContract c = new CarRentalContract();
    
 String CarRentalContracts[]={c.toString()};
 
//method to add contract
void addContract(CarRentalContract c1){
     for(int i=0; i<CarRentalContracts.length; i++) {
         CarRentalContracts[i] = c1.toString();
      }
}
//method to display contracts
 String displayContracts(){
    for(String contracts:  CarRentalContracts){
        System.out.println(contracts);
    }
    return "";
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vehicle
         System.out.println("Vehicle");
        Vehicle v = new Vehicle();
        v.getColor();
        
        //car
         System.out.println("\nCar");
        Car c = new Car();
        c.get_car();
        
        //truck
         System.out.println("\nTruck");
        Truck t = new Truck();
        t.getTruck();
        
        //garage
         System.out.println("\nGarage");
        Garage g = new Garage();
        g.setVehicle(v);
        
        //garagetester
         System.out.println("\nGarageTester");
        GarageTester gt = new GarageTester();
        gt.getExample();
        
        //carrentalcontract
         System.out.println("\nCar rental contract");
        CarRentalContract cc = new CarRentalContract();
        cc.carRented();
       
        //contracts
         System.out.println("\nCar rental");
        CarRental cr = new CarRental();
        cr.addContract(cc);
        cr.displayContracts();
    }
    
}

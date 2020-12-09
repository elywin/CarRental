package thecarrental;


import java.util.Arrays;


public class CarRental {
     Customer nc1 = new Customer("jack","Kampala");
//     Customer nc2 = new Customer("Kinobe","Toronto");
      Vehicle bencar = new Car("Green",true);
//      Vehicle chevroletCar = new Car("Purple",true);
//      CarRentalContract cc3 = new CarRentalContract(nc2,chevroletCar);
    CarRentalContract cr = new CarRentalContract(nc1,bencar);
   String carArray[] = {cr.toString()};
   
    
    void addContract(CarRentalContract c1){

        for(int i=0; i<carArray.length; i++){
            carArray[i] = c1.toString(); 
        }
    }

    String displayContracts(){
          
        //return Arrays.toString(carArray);
        if(carArray.length > 0){
           for (String contract : carArray){
               //return contract.toString();
               System.out.println(contract);
            } 
        }
        else{            
            return "No Car Rental Contracts";
        }
        return "";
    }
    
    
}

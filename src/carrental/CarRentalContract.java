package thecarrental;


public class CarRentalContract {
   
    Customer cm; 
    Vehicle vh; 
    
    CarRentalContract(Customer custo , Vehicle vim)
    {
        cm = custo;
        vh = vim;
    }
    
//    
//    static int carObjects = 0; 
//    { 
//        carObjects += 1; 
//    }
    
    public String toString(){
        
        return cm.name+" : "+vh.toString();
    }
    
}

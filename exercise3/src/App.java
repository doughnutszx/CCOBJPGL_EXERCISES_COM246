public class App {
    public static void main(String[] args) throws Exception {

        //polymorphic variable/object
        HybridVehicle car1 = new HybridPickup();
        car1.carname = "Hybrid Pickup";

        //2
        HybridVehicle car2 = new HybridSedan();
        car2.carname = "Hybrid Sedan";

        carwash wash1 = new carwash();
        carwash wash2 = new carwash();

        wash1.wash(car1);
        wash2.wash(car2);
        


    }
}

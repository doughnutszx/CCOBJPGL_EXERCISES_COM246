public class Hybrid implements electric, InternalCombustion {
    
    @Override
    public void chargebattery (){
    System.out.println("charging battery");
    }

    @Override
    public void fillgas (){ 
    System.out.println("refueling gas");
    }
}

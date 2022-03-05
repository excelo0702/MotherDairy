import Customers.CustomerA;
import Customers.CustomerB;
import Customers.CustomerC;

public class MotherDairyData {
    // A,B,C subscribed to MotherDairy
    CustomerA custA = new CustomerA();
    CustomerB custB = new CustomerB();
    CustomerC custC = new CustomerC();

    //Daily Morning when we gets milk, we delivery to them
    public void delivery(){
        custA.deliver();
        custB.deliver();
        custC.deliver();
    }
}

import Customers.CustomerA;
import Customers.CustomerB;
import Customers.CustomerC;
import MotherDairy.MotherDairyData;

public class MotherDairySImulator {
    public static void main(String[] args){
        MotherDairyData mod = new MotherDairyData();
        //Currently we have only 2 customers
        CustomerA custA = new CustomerA(mod);
        CustomerB custB = new CustomerB(mod);

        //Notify them
        mod.deliver();

        System.out.println("Customer C wants to add");
        CustomerC custC = new CustomerC(mod);
        mod.deliver();

        System.out.println("B wants to out");
        custB.remove();

        mod.deliver();

    }
}

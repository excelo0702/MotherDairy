package Customers;

import MotherDairy.MotherDairyData;

public class CustomerC implements ICustomer{

    private MotherDairyData motherDairyData;

    public CustomerC(MotherDairyData motherDairyData){
        this.motherDairyData = motherDairyData;
        register();
    }

    @Override
    public void register() {
        motherDairyData.register("CustomerC",this);
    }

    @Override
    public void remove() {
        motherDairyData.remove("CustomerC");
    }

    @Override
    public void deliver() {
        System.out.println("I am customer C, milk delivered");
    }
}

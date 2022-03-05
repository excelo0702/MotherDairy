package Customers;

import MotherDairy.MotherDairyData;

public class CustomerB implements ICustomer{

    private MotherDairyData motherDairyData;


    public CustomerB(MotherDairyData motherDairyData){
        this.motherDairyData = motherDairyData;
        register();
    }

    @Override
    public void register() {
        motherDairyData.register("customerB",this);
    }

    @Override
    public void remove() {
        motherDairyData.remove("customerB");
    }

    @Override
    public void deliver() {
        System.out.println("I am customer B, milk delivered ");
    }
}

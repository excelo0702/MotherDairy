package Customers;

import MotherDairy.MotherDairyData;

public class CustomerA implements ICustomer {

    private MotherDairyData motherDairyData;

    public CustomerA(MotherDairyData motherDairyData) {
        this.motherDairyData = motherDairyData;
        register();
    }

    @Override
    public void register() {
        motherDairyData.register("customerA",this);
    }

    @Override
    public void remove() {
        motherDairyData.remove("customerA");
    }

    @Override
    public void deliver() {
        System.out.println("I am customer A, milk delivered");
    }
}

package MotherDairy;

import Customers.ICustomer;

public interface IMotherDairyData {
    void register(String customerId, ICustomer customer);
    void remove(String customerId);
    void deliver();
}

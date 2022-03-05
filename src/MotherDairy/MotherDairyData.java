package MotherDairy;

import Customers.ICustomer;
import MotherDairy.IMotherDairyData;

import java.util.HashMap;
import java.util.Map;

public class MotherDairyData implements IMotherDairyData {
    public MotherDairyData() {}

    Map<String,ICustomer> customerMap = new HashMap<>();

    @Override
    public void register(String customerId, ICustomer customer) {
        customerMap.put(customerId,customer);
    }

    @Override
    public void remove(String customerId) {
        customerMap.remove(customerId);
    }

    @Override
    public void deliver() {
        for (var customer:customerMap.entrySet()) {
            customer.getValue().deliver();
        }
    }
}

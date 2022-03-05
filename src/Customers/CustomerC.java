package Customers;

public class CustomerC implements ICustomer{
    @Override
    public void deliver() {
        System.out.println("I am customer C, milk delivered");
    }
}

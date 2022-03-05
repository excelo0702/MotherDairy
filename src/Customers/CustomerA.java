package Customers;

public class CustomerA implements ICustomer{
    @Override
    public void deliver() {
        System.out.println("I am customer A, milk delivered");
    }
}

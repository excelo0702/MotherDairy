package Customers;

public class CustomerB implements ICustomer{
    @Override
    public void deliver() {
        System.out.println("I am customer B, milk delivered ");
    }
}

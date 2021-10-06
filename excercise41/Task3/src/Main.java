import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Customer1","user1"));
        customers.add(new Customer("Customer2","user2"));
        customers.add(new Customer("Customer3","user3"));
        customers.add(new Customer("Customer4","user4"));
        customers.add(new Customer("Customer5","user5"));
        customers.add(new Customer("Customer6","user6"));

        printCustomers();
    }

    public static void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

package workshop.one.to.many.exxxx;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Order order = new Order();

        customer.setFirstName("Tomek");
        customer.setLastName("Piwowarski");
        order.setOrderDate(LocalDateTime.now());

    }
}

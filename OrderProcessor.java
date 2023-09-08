import java.util.ArrayList;
import java.util.List;




public class OrderProcessor {
    private List<Order> orders;

    public OrderProcessor() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void processOrders() {
        for (Order order : orders) {
            if (order instanceof PhysicalProductOrder) {
                PhysicalProductOrder physicalOrder = (PhysicalProductOrder) order;
                physicalOrder.shipProduct();
            } else if (order instanceof DigitalProductOrder) {
                DigitalProductOrder digitalOrder = (DigitalProductOrder) order;
                digitalOrder.sendEmail();
            }
        }
    }

    public void printInvoice(Order order) {
        if (order instanceof PhysicalProductOrder) {
            PhysicalProductOrder physicalOrder = (PhysicalProductOrder) order;
            // Print invoice for physical product
        } else if (order instanceof DigitalProductOrder) {
            DigitalProductOrder digitalOrder = (DigitalProductOrder) order;
            // Print invoice for digital product
        }
    }
}

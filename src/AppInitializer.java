import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.entity.OrderDetail;
import lk.ijse.hibernate.entity.Orders;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction tx = session.beginTransaction();
        //Customer Add
  /*      Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Amal");
        c1.setAddress("Panadura");
        c1.setSalary(BigDecimal.valueOf(10000.00));

        session.save(c1);

       // Add Item
       -------------------
        Item i1 = new Item();
        i1.setCode("I001");
        i1.setDescription("Tea bag");
        i1.setQtyOnHand(100);
        i1.setUnitPrice(BigDecimal.valueOf(100.00));
        session.save(i1);*/

     /*
     //place Order
     ------------------------
      Customer c2 = new Customer();
        c2.setId("C002");
        c2.setName("kamal");
        c2.setAddress("Horana");
        c2.setSalary(BigDecimal.valueOf(1000.00));

        Orders o1 = new Orders();
        o1.setId("O001");
        o1.setDate(LocalDate.now());
        o1.setCustomer(c2);

        Orders o2 = new Orders();
        o2.setId("O002");
        o2.setDate(LocalDate.now());
        o2.setCustomer(c2);

        c2.getOrderList().add(o1);
        c2.getOrderList().add(o2);

        session.save(c2);
        session.save(o1);
        session.save(o2);*/

        //OrderDetail

        Item i4 = new Item();
        i4.setCode("I004");
        i4.setDescription("Peppsi");
        i4.setUnitPrice(BigDecimal.valueOf(100.00));
        i4.setQtyOnHand(50);

        Item i5 = new Item();
        i5.setCode("I005");
        i5.setDescription("Chocolate");
        i5.setUnitPrice(BigDecimal.valueOf(200.00));
        i5.setQtyOnHand(50);

        Customer c1 = new Customer();
        c1.setId("C004");
        c1.setName("Amali");
        c1.setAddress("Panadura");
        c1.setSalary(BigDecimal.valueOf(10000.00));

        Orders o1 = new Orders();
        o1.setId("O003");
        o1.setCustomer(c1);
        o1.setDate(LocalDate.now());

        OrderDetail od1 = new OrderDetail();
        od1.setId("OD-001");
        od1.setOrders(o1);
        od1.setItem(i4);
        od1.setQty(10);

        OrderDetail od2 = new OrderDetail();
        od2.setId("OD-002");
        od2.setOrders(o1);
        od2.setItem(i5);
        od2.setQty(10);


        session.save(c1);
        session.save(i4);
        session.save(i5);
        session.save(o1);
        session.save(od1);
        session.save(od2);


        tx.commit();
    }
}

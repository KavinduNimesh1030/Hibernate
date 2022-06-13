package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private BigDecimal salary;

    @OneToMany(mappedBy = "customer")
    private List<Orders> ordersList = new ArrayList<>();

    public Customer() {
    }

    public Customer(String id, String name, String address, BigDecimal salary, List<Orders> ordersList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.ordersList = ordersList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


    public List<Orders> getOrderList() {
        return ordersList;
    }

    public void setOrderList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", orderList=" + ordersList +
                '}';
    }
}
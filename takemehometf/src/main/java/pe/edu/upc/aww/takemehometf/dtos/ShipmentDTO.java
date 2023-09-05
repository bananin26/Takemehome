package pe.edu.upc.aww.takemehometf.dtos;

import pe.edu.upc.aww.takemehometf.entities.Order;
import pe.edu.upc.aww.takemehometf.entities.User;
import java.time.LocalDate;
import java.util.Date;

public class ShipmentDTO {
    private int id;
    private Order order;
    private User user;
    private Number payment;
    private LocalDate paymentDate;
    private Date arrivalDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Number getPayment() {
        return payment;
    }

    public void setPayment(Number payment) {
        this.payment = payment;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}


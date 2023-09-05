package pe.edu.upc.aww.takemehometf.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "shipments")

public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;
    @Column (name = "payment",nullable = false)
    private Number payment;
    @Column(name = "payment_date",nullable = false)
    private LocalDate paymentDate;
    @Column(name = "arrival_date",nullable = false)
    private Date arrivalDate;

    public Shipment() {
    }
    public Shipment(int id,Number payment, LocalDate paymentDate, Date arrivalDate, Order order, User user){
        this.id=id;
        this.payment = payment;
        this.paymentDate = paymentDate;
        this.arrivalDate = arrivalDate;
        this.order = order;
        this.user = user;
    }

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

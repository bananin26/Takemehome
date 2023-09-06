package pe.edu.upc.aww.takemehometf.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","rol"})})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String traveler;
    public String customer;
    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTraveler() {
        return traveler;
    }

    public void setTraveler(String traveler) {
        this.traveler = traveler;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

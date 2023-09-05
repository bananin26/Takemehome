package pe.edu.upc.aww.takemehometf.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="supports")

public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSupport;
    @Column (name = "comment",length = 100,nullable = false)
    private String comment;

    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    public Support(){
    }

    public Support (int idSupport,String comment, User user, LocalDate date){
        this.idSupport = idSupport;
        this.comment = comment;
        this.user = user;
        this.date = date;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

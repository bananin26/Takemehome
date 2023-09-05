package pe.edu.upc.aww.takemehometf.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="notifications")

public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotification;
    @Column(name = "title",length = 45,nullable = false)
    private String title;
    @Column(name = "description",length = 100,nullable = false)
    private String description;
    @Column(length = 2000)
    private String urlImage;
    @Column(name = "date",nullable = false)
    private LocalDate date;
    @Column(name = "viewed",nullable = false)
    private Boolean viewed;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Notification(){
    }

    public Notification(int idNotification,String title, String description, String urlImage, LocalDate date, User user) {
        this.idNotification= idNotification;
        this.description=description;
        this.urlImage=urlImage;
        this.date=date;
        this.user=user;
        this.viewed=false;
        this.title=title;
    }

    public int getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}





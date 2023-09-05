package pe.edu.upc.aww.takemehometf.dtos;

import pe.edu.upc.aww.takemehometf.entities.User;

import javax.persistence.*;
import java.time.LocalDate;

public class NotificationDTO {

    private int idNotification;
    private LocalDate date;
    private String description;
    private String title;
    private String urllmage;
    private Boolean viewed;

    public int getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrllmage() {
        return urllmage;
    }

    public void setUrllmage(String urllmage) {
        this.urllmage = urllmage;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }
}

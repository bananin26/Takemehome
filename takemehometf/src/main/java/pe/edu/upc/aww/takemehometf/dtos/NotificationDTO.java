package pe.edu.upc.aww.takemehometf.dtos;

import lombok.Getter;
import pe.edu.upc.aww.takemehometf.entities.User;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
public class NotificationDTO {

    private int idNotification;
    private LocalDate date;
    private String description;
    private String title;
    private String urlImage;
    private Boolean viewed;

    public void setIdNotification(int idNotification) {
        this.idNotification = idNotification;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }
}

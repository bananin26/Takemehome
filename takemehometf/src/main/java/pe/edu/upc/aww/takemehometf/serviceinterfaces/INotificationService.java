package pe.edu.upc.aww.takemehometf.serviceinterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehometf.entities.Notification;

import java.util.List;

public interface INotificationService  {
    public void insert(Notification notification);
    public List<Notification> list();
    public void delete(int idNotification);
    public  Notification listTitle(int Title);
    List<Notification>findByTitle(String title);


}

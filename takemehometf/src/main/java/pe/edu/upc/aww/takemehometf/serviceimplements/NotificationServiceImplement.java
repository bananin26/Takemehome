package pe.edu.upc.aww.takemehometf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehometf.entities.Notification;
import pe.edu.upc.aww.takemehometf.repositories.INotificationRepository;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.INotificationService;
import java.util.List;

@Service
public class NotificationServiceImplement implements INotificationService {
@Autowired
    private INotificationRepository nR;

    @Override
    public void insert(Notification notification) {
        nR.save(notification);

    }

    @Override
    public List<Notification> list() {
        return nR.findAll();
    }

    @Override
    public void delete(int idNotification) {
        nR.deleteById(idNotification);
    }

    @Override
    public Notification listTitle(int Title) {
        return nR.findById(Title).orElse(new Notification());
    }

    @Override
    public List<Notification>findByTitle(String title){return nR.findByTitle(title);}



}

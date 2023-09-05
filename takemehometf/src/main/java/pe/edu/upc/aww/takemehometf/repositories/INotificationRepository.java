package pe.edu.upc.aww.takemehometf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.takemehometf.entities.Notification;

@Repository
public interface INotificationRepository extends JpaRepository<Notification,Integer> {

}

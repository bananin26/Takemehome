package pe.edu.upc.aww.takemehometf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.takemehometf.entities.Shipment;
@Repository
public interface IShipmentRepository extends JpaRepository<Shipment,Long> {
    //Shipment FindByOrder(Order order);
}

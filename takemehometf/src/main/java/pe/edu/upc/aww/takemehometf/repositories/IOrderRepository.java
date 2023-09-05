package pe.edu.upc.aww.takemehometf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehometf.entities.Order;

public interface IOrderRepository extends JpaRepository<Order,Integer> {

}
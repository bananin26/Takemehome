package pe.edu.upc.aww.takemehometf.serviceinterfaces;

import pe.edu.upc.aww.takemehometf.entities.Order;
import pe.edu.upc.aww.takemehometf.entities.User;

import java.util.List;

public interface IOrderService {
    public void insert(Order order);
    public List<Order> list();
    public void delete(int idOrder);
    public Order listId(int idOrder);

}

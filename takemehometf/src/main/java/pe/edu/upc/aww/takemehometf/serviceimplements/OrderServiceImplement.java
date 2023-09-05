package pe.edu.upc.aww.takemehometf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehometf.entities.Order;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.IOrderService;
import pe.edu.upc.aww.takemehometf.repositories.IOrderRepository;

import java.util.List;


@Service
public class OrderServiceImplement implements IOrderService {
    @Autowired
    private IOrderRepository oR;
    @Override
    public void insert(Order order) {
        oR.save(order);
    }
    @Override
    public List<Order> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int idOrder) {
        oR.deleteById(idOrder);
    }

    @Override
    public Order listId(int idOrder) {
        return oR.findById(idOrder).orElse(new Order());
    }

}

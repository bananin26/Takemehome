package pe.edu.upc.aww.takemehometf.serviceinterfaces;

import pe.edu.upc.aww.takemehometf.entities.Shipment;
import java.util.List;

public interface IShipmentService {
    public void insert(Shipment shipment);
    public  List<Shipment>list();
}

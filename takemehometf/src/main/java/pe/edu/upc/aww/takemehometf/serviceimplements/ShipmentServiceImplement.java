package pe.edu.upc.aww.takemehometf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehometf.entities.Shipment;
import pe.edu.upc.aww.takemehometf.repositories.IShipmentRepository;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.IShipmentService;

import java.util.List;

@Service
public class ShipmentServiceImplement implements IShipmentService {
    @Autowired
    private IShipmentRepository iR;

    @Override
    public void insert(Shipment shipment) {
        iR.save(shipment);
    }

    @Override
    public List<Shipment> list() {
        return iR.findAll();
    }
}

package pe.edu.upc.aww.takemehometf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehometf.dtos.ShipmentDTO;
import pe.edu.upc.aww.takemehometf.entities.Shipment;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.IShipmentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("shipments")
public class ShipmentController {
    @Autowired
    private IShipmentService sS;

    @PostMapping
    public void registrar(@RequestBody ShipmentDTO dto) {
        ModelMapper m = new ModelMapper();
        Shipment s = m.map(dto, Shipment.class);
        sS.insert(s);


    }

    @GetMapping
    public List<ShipmentDTO> listar() {
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ShipmentDTO.class);
        }).collect(Collectors.toList());

    }

}

package pe.edu.upc.aww.takemehometf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehometf.entities.Notification;
import pe.edu.upc.aww.takemehometf.dtos.NotificationDTO;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.INotificationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private INotificationService nS;

    @PostMapping
    public void registrar(@RequestBody NotificationDTO dto) {
        ModelMapper m = new ModelMapper();
        Notification n = m.map(dto, Notification.class);
        nS.insert(n);
    }

    public List<NotificationDTO> listar() {
        return nS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificationDTO.class);
        }).collect(Collectors.toList());


    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        nS.delete(id);

    }
    @GetMapping("/{id}")
    public NotificationDTO listarTitle(@PathVariable("title")Integer title){
        ModelMapper m=new ModelMapper();
        NotificationDTO dto=m.map(nS.listTitle(title),NotificationDTO.class);
        return dto;


    }
}

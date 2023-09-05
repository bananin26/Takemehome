package pe.edu.upc.aww.takemehometf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehometf.dtos.SupportDTO;
import pe.edu.upc.aww.takemehometf.entities.Support;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.ISupportService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Supports")
public class SupportController {
    @Autowired
    private ISupportService sS;

    @PostMapping
    public void register(@RequestBody SupportDTO dto){
        ModelMapper m = new ModelMapper();
        Support s= m.map(dto, Support.class);
        sS.insert(s);
    }
    @GetMapping
    public List<SupportDTO> to_list(){
        return sS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,SupportDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        sS.delete(id);
    }

    @GetMapping("/{id}")
    public SupportDTO to_listId(@PathVariable ("id") Integer id) {
        ModelMapper m = new ModelMapper();
        SupportDTO dto = m.map(sS.listId(id),SupportDTO.class);
        return dto;
    }
    @PutMapping
    public void change(@RequestBody SupportDTO dto){
        ModelMapper m = new ModelMapper();
        Support s = m.map(dto,Support.class);
        sS.insert(s);
    }

}
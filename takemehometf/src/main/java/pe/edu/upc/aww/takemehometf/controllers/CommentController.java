package pe.edu.upc.aww.takemehometf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.takemehometf.dtos.CommentDTO;
import pe.edu.upc.aww.takemehometf.entities.Comment;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.ICommentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comments")
public class CommentController {
    @Autowired
    private ICommentService cS;

    @PostMapping
    public void register(@RequestBody CommentDTO dto){
        ModelMapper m = new ModelMapper();
        Comment c= m.map(dto, Comment.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CommentDTO> to_list(){
        return cS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,CommentDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CommentDTO to_listId(@PathVariable ("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CommentDTO dto = m.map(cS.listId(id),CommentDTO.class);
        return dto;
    }
    @PutMapping
    public void change(@RequestBody CommentDTO dto){
        ModelMapper m = new ModelMapper();
        Comment c = m.map(dto,Comment.class);
        cS.insert(c);
    }

}

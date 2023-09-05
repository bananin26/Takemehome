package pe.edu.upc.aww.takemehometf.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehometf.entities.Comment;
import pe.edu.upc.aww.takemehometf.repositories.ICommentRepository;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.ICommentService;

import java.util.List;

@Service
public class CommentServiceImplement implements ICommentService {
    @Autowired
    private ICommentRepository cR;


    @Override
    public void insert(Comment comment) {
        cR.save(comment);
    }

    @Override
    public List<Comment> list() {
        return cR.findAll();
    }

    @Override
    public Comment listId(int idComment) {
        return cR.findById(idComment).orElse(new Comment());
    }

    @Override
    public void delete(int idComment) {
        cR.deleteById(idComment);
    }
}
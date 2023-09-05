package pe.edu.upc.aww.takemehometf.serviceinterfaces;

import pe.edu.upc.aww.takemehometf.entities.Comment;

import java.util.List;

public interface ICommentService {

    public void insert(Comment comment);
    public List<Comment> list();
    public Comment listId(int idComment);
    public void delete(int idComment);

}

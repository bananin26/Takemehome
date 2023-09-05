package pe.edu.upc.aww.takemehometf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehometf.entities.Comment;


public interface ICommentRepository extends JpaRepository<Comment,Integer> {
}

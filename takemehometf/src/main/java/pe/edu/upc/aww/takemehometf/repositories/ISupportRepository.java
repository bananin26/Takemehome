package pe.edu.upc.aww.takemehometf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehometf.entities.Support;

public interface ISupportRepository extends JpaRepository<Support,Integer> {
}

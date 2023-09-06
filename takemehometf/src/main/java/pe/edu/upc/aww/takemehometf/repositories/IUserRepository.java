package pe.edu.upc.aww.takemehometf.repositories;

import pe.edu.upc.aww.takemehometf.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface IUserRepository extends JpaRepository<User,Integer> {
    List<User> findByBirthday(LocalDate birthday);
}

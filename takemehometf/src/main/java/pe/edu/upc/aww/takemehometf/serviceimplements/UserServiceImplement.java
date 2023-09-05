package pe.edu.upc.aww.takemehometf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehometf.entities.User;
import pe.edu.upc.aww.takemehometf.repositories.IUserRepository;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.IUserService;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;
    @Override
    public void insert(User user) {
        uR.save(user);
    }

    @Override
    public List<User> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUser) {
        uR.deleteById(idUser);
    }

    @Override
    public User listId(int idUser) {
        return uR.findById(idUser).orElse(new User());
    }

    @Override
    public List<User> findByBirthday(LocalDate birthday) {
        return uR.findByBirthday(birthday);
    }
}

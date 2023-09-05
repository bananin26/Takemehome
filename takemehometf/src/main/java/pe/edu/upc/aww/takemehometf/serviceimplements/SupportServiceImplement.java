package pe.edu.upc.aww.takemehometf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehometf.entities.Support;
import pe.edu.upc.aww.takemehometf.repositories.ISupportRepository;
import pe.edu.upc.aww.takemehometf.serviceinterfaces.ISupportService;

import java.util.List;

@Service
public class SupportServiceImplement implements ISupportService {
    @Autowired
    private ISupportRepository sR;
    @Override
    public void insert(Support support) {
        sR.save(support);
    }

    @Override
    public List<Support> list() {
        return sR.findAll();
    }

    @Override
    public Support listId(int idSupport) {
        return sR.findById(idSupport).orElse(new Support());
    }

    @Override
    public void delete(int idSupport) {
        sR.deleteById(idSupport);
    }
}

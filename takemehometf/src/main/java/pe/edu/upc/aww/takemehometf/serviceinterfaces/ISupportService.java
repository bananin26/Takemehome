package pe.edu.upc.aww.takemehometf.serviceinterfaces;

import pe.edu.upc.aww.takemehometf.entities.Support;

import java.util.List;

public interface ISupportService {
    public void insert(Support support);

    public List<Support> list();
    public Support listId(int idSupport);

    public void delete(int idSupport);
}

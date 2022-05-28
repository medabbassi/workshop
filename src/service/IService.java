package service;

import entities.Personne;

import java.sql.SQLException;
import java.util.List;

public interface IService<T> {
    public void ajouter (T t) throws SQLException;
    public List<T> afficher();
    public void modifier(T t);
    public void supprimer(T t);

}

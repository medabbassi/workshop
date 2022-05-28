package service;

import entities.Personne;
import utils.myDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class servicePersonne  implements  IService<Personne>{
    Connection cnx = myDB.getInstance().getCnx();
    @Override
    public void ajouter(Personne personne) {
     try {
         String qry= "INSERT INTO `user`(`nom`,`prenom`) VALUES (`"+personne.getNom()+"`,`"+personne.getPrenom()+"`)";
         Statement statement =cnx.createStatement();
            statement.executeUpdate(qry);
     } catch (SQLException e) {
         System.out.println(e.getMessage());
     }
    }

    @Override
    public List<Personne> afficher() {
        return null;
    }

    @Override
    public void modifier(Personne personne) {

    }

    @Override
    public void supprimer(Personne personne) {

    }
}

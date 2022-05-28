package entities;

public class Personne {
    private  int id;
    private  String nom,prenom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne() {

    }

    public String toString() {
      return  "Personne de id:"+getId()+" nom :"+getNom()+" prenom: "+getPrenom();
    }




}

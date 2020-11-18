package com.chassagnes;

public class Eleve extends Personne {

    //Attribut privée
    private String _classe;

    //Constructeur
    public Eleve(String Nom, String Prenom, String Adresse, String Classe){
        super(Nom, Prenom, Adresse);
        _classe = Classe;
    }
    //Propriété
    public String get_nom(){
        return _nom;
    }

    public String get_prenom(){
        return _prenom;
    }

    public String get_adresse(){
        return _adresse;
    }

    public String get_classe(){
        return _classe;
    }

    @Override
    public String toString(){
        String unEleve;
        unEleve ="Nom : "+ _nom+" Prenom : "+_prenom+" Adresse : "+_adresse+" Classe : "+_classe;
        return unEleve;
    }

}

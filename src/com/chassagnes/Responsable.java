package com.chassagnes;

public class Responsable extends Enseignant {

    //Attribut privée
    private int _prime;

    //Constructeur

    public Responsable(String Nom, String Prenom, String Adresse, int Echelon, Float nbHeures, int Prime){
        super(Nom, Prenom, Adresse, Echelon, nbHeures);
        _prime = Prime;

    }
    //Propriétés
    public String get_nom(){
        return _nom;
    }

    public String get_prenom(){
        return _prenom;
    }

    public String get_adresse(){
        return _adresse;
    }

    public int get_echelon() {
        return _echelon;
    }

    public Float get_nbHeures(){
        return _nbHeures;
    }
    public int get_prime(){
        return _prime;
    }

    @Override
    public String toString(){
        String unResponsable;
        unResponsable ="Nom : "+ _nom+" Prenom : "+_prenom+" Adresse : "+_adresse+" Echelon : "+_echelon+" Nombre d'heure : "+_nbHeures+" Prime : "+_prime;
        return unResponsable;
    }



    public double CalculSalaire(){
        double txsalaire = this.GetPrixHeure(_echelon);
        if (EchelonValide() == true){
            return txsalaire * _nbHeures *_prime;
        }
        else {
            return 0;
        }
    }

}

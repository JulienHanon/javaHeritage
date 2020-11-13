package com.chassagnes;

public class Enseignant extends Personne{
    private int _echelon;
    private Float _nbHeures;
    private double[] _tauxSalaire = new double[]{40,42,43,44,46,50,52,54,60,65};

    public Enseignant(String Nom, String Prenom, String Adresse, int Echelon, Float nbHeures){
        super(Nom, Prenom, Adresse);
        _echelon = Echelon;
        _nbHeures = nbHeures;

    }

    public Enseignant(String Nom, String Prenom, String Adresse, int Echelon) {
        super(Nom, Prenom, Adresse);
        _echelon = Echelon;
    }


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
    public String toString(){
        String unEnseignant;
        unEnseignant ="Nom : "+ _nom+" Prenom : "+_prenom+" Adresse : "+_adresse+" Echelon : "+_echelon/*+" Nombre d'heure : "+_nbHeures*/;
        return unEnseignant;
    }
    public boolean EchelonValide()  {
        if (_echelon>1 && _echelon<11){
            return true;

        }
        else  {
            return false;
        }
    }
    public double GetPrixHeure(int Echelon) {
        return _tauxSalaire[Echelon];
    }
    public double CalculSalaire(){
        double txsalaire = this.GetPrixHeure(_echelon);
        if (EchelonValide() == true){
            return txsalaire * _nbHeures;
        }
        else {
            return 0;
        }
    }

}

package com.chassagnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnseignantTest {

    Enseignant enseignant = new Enseignant("Nom", "Prenom", "Adresse", 0, (float) 4.2);

    @Test
    void get_nom() {
        assertEquals("Nom",enseignant.get_nom());
    }

    @Test
    void get_prenom() {
        assertEquals("Prenom",enseignant.get_prenom());
    }

    @Test
    void get_adresse() {
        assertEquals("Adresse",enseignant.get_adresse());
    }

    @Test
    void get_echelon() {
        assertEquals( 0 ,enseignant.get_echelon());
    }

    @Test
    void get_nbHeures() {
        assertEquals((float)4.2,enseignant.get_nbHeures());
    }



    @Test
    void testToString() {
        assertEquals("Nom : Nom Prenom : Prenom Adresse : Adresse Echelon : " +0+" Nombre d'heure : "+4.2,enseignant.toString());
    }

    @Test
    void echelonValide() {
        assertEquals(false, enseignant.EchelonValide());
    }

    @Test
    void getPrixHeure() {
        assertEquals(40, enseignant.GetPrixHeure(0));
    }

    @Test
    void calculSalaire() {
        assertEquals(0, enseignant.CalculSalaire());
    }
}
package com.chassagnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResponsableTest {

    Responsable responsable = new Responsable("Nom", "Prenom", "Adresse", 0, (float) 4.2, 5);


    @Test
    void get_nom() {
        assertEquals("Nom",responsable.get_nom());
    }

    @Test
    void get_prenom() {
        assertEquals("Prenom",responsable.get_prenom());
    }

    @Test
    void get_adresse() {
        assertEquals("Adresse",responsable.get_adresse());
    }

    @Test
    void get_echelon() {
        assertEquals(0, responsable.get_echelon());
    }

    @Test
    void get_nbHeures() {
        assertEquals((float)4.2,responsable.get_nbHeures());
    }

    @Test
    void get_prime(){
        assertEquals(5, responsable.get_prime());
    }

    @Test
    void testToString() {
        assertEquals("Nom : Nom Prenom : Prenom Adresse : Adresse Echelon : " +0+" Nombre d'heure : "+4.2+" Prime : "+5,responsable.toString());
    }

    @Test
    void echelonValide() {
        assertEquals(false, responsable.EchelonValide());
    }

    @Test
    void getPrixHeure() {
        assertEquals(40, responsable.GetPrixHeure(0));
    }

    @Test
    void calculSalaire() {
        assertEquals(0, responsable.CalculSalaire());
    }
}
package com.chassagnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EleveTest {

    Eleve eleve = new Eleve("Nom", "Prenom", "Adresse", "Classe");


    @Test
    void get_nom() {
        assertEquals("Nom",eleve.get_nom());
    }

    @Test
    void get_prenom() {
        assertEquals("Prenom",eleve.get_prenom());
    }

    @Test
    void get_adresse() {
        assertEquals("Adresse",eleve.get_adresse());
    }

    @Test
    void get_classe() {
        assertEquals("Classe",eleve.get_classe());
    }

    @Test
    void testToString() {
        assertEquals("Nom : Nom Prenom : Prenom Adresse : Adresse Classe : Classe",eleve.toString());

    }
}
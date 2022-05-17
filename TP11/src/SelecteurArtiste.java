package main;

import main.donnees.CD;

public class SelecteurArtiste implements Selecteur {

    private String nomArtiste;

    public SelecteurArtiste(String nomArtiste) {
        this.nomArtiste = nomArtiste;
    }

    @Override
    public boolean garderCd(CD cd) {
        return cd.getNomArtiste().equals(nomArtiste);
    }

}

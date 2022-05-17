package main;

import main.donnees.CD;

public class SelecteurNbPistes implements Selecteur{

        private int nbPistes;

        public SelecteurNbPistes(int nbPistes) {
            this.nbPistes = nbPistes;
        }

        @Override
        public boolean garderCd(CD cd) {
            return cd.getNombrePistes() == nbPistes;
        }
}

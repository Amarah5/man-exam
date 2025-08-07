package com.mahery;

import java.util.Date;

public class Administrateur extends Utilisateur{

    public Administrateur(String idUtilisateur, String nomUtilisateur, String email, Date dateCreation) {
        super(idUtilisateur, nomUtilisateur, email, dateCreation);
    }

    @Override
    public void supprimerPublicationOrCommentaire() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void supprimerUtilisateur() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}

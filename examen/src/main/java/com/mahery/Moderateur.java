package com.mahery;

import java.util.Date;
import java.util.List;

public class Moderateur  extends Utilisateur{

    public Moderateur(String idUtilisateur, String nomUtilisateur, String email, Date dateCreation, List<Groupe> newGroupe) {
        super(idUtilisateur, nomUtilisateur, email, dateCreation, newGroupe);
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

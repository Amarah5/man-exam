package com.mahery;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public abstract class Utilisateur {
    private String id;
    private String nomUtilisateur;
    private String email;
    private LocalDate dateCreation;

    public Utilisateur(String id, String nomUtilisateur, String email) {
        this.id = id;
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.dateCreation = LocalDate.now();
    }

 

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Utilisateur))
            return false;

        Utilisateur autre = (Utilisateur) obj;

        return this.id.equals(autre.id) &&
                this.nomUtilisateur.equals(autre.nomUtilisateur) &&
                this.email.equals(autre.email);
    }


    @Override
    public String toString() {
        return nomUtilisateur + " (" + email + ")";
    }
}

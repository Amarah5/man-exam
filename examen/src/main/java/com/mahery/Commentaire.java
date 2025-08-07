package com.mahery;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class Commentaire {
    private String contenu;
    private Utilisateur auteur;
    private LocalDateTime date;

    public Commentaire(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
        this.date = LocalDateTime.now();






        
    }
}

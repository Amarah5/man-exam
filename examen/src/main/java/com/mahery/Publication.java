package com.mahery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Publication {
    private String contenu;
    private Utilisateur auteur;
    private LocalDateTime date;
    private List<Commentaire> commentaires;

    public Publication(String contenu, Utilisateur auteur) {
        this.contenu = contenu;
        this.auteur = auteur;
        this.date = LocalDateTime.now();
        this.commentaires = new ArrayList<>();
    }

    public void ajouterCommentaire(Commentaire commentaire) {
        commentaires.add(commentaire);
    }

    public boolean supprimerCommentaire(Commentaire commentaire, Utilisateur utilisateur) {
        if (utilisateur instanceof Moderateur || commentaire.getAuteur().equals(utilisateur)) {
            return commentaires.remove(commentaire);
        }
        return false;
    }

    
}

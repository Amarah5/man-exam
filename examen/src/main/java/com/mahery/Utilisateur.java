package com.mahery;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Utilisateur{
    private String idUtilisateur;
    private String nomUtilisateur;
    private String email;
    private Date dateCreation;
    private Groupe newGroupe;

    public void createPublication(){
        Publication newPublication = new Publication(idPublication, email, dateCreation, this);
        newGroupe.setListPubliction(add(newPublication));

    };
    public void commentPublication(){
        Commentaire newCommentaire = new Commentaire(idCommentaire, dateCreation, this);
        newGroupe.setListCommentaires(add(newCommentaire));
        
    };
    public  void supprimerPublicationOrCommentaire(){
        
    };
    public abstract  void supprimerUtilisateur();
    
}

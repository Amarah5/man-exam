package com.mahery;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Utilisateur {
    private String idUtilisateur;
    private String nomUtilisateur;
    private String email;
    private Date dateCreation;

    public void createPublication(){

    };
    public void commentPublication(){
        
    };
    public  abstract void supprimerPublicationOrCommentaire();
    public abstract  void supprimerUtilisateur();
    
}

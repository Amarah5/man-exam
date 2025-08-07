package com.mahery;


import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Groupe {
    private String nom;
    private ArrayList<Utilisateur> listeUtilisateurs= new ArrayList<>();
    private ArrayList<Publication> listPubliction = new ArrayList<>();
    private ArrayList<Commentaire>  listCommentaires = new ArrayList<>();

    public Groupe(String nomGroupe){
        this.nom= nomGroupe;
    }
}


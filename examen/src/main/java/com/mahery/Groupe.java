package com.mahery;


import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Groupe {
    private String nom;
    public ArrayList<Utilisateur> listeUtilisateurs= new ArrayList<>();
    public Groupe(String nomGroupe){
        this.nom= nomGroupe;
    }
}


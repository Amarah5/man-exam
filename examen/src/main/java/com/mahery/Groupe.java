package com.mahery;


import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Groupe {
    private String nom;
    private ArrayList<Utilisateur> lUtilisateurs= new ArrayList<>();
}

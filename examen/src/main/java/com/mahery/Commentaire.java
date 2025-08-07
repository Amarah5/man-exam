package com.mahery;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Commentaire {
    private int idCommentaire;
    private  Date dateCOmmentaire;
    private Utilisateur Commentateur;

}

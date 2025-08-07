package com.mahery;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Publication {
    private int idPublication;
    private String Description;
    private Date datePublication;
    private Utilisateur publière;

}

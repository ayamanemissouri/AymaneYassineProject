package com.projet.ma7ali.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Temporal(value = TemporalType.DATE)
    private Date date;
    private int nombreDeVisite;
    @OneToMany
    private List<Vote> votes;
    @OneToMany
    private List<Commentaire> commentaires;

}


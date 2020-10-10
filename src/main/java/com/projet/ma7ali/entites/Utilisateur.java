package com.projet.ma7ali.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @JsonIgnore
    private String motDepasse;
    private String email;
    @Temporal(value = TemporalType.TIME)
    private Date dateDeNaissance;
    private int numeroTel;
    //Adresse
    //List les annonces


}

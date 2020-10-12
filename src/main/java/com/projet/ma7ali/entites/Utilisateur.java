package com.projet.ma7ali.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String nom;
    private String prenom;
    @Lob
    private Byte[] image;
    @JsonIgnore
    private String motDepasse;
    private String email;
    @Temporal(value = TemporalType.TIME)
    private Date dateDeNaissance;
    private int numeroTel;
    @ManyToOne
    private Adresse adresse;
    @OneToMany
    private List<Annonce> annonces;
    @OneToMany
    private List<Vote> vote;
    @OneToMany
    private List<Commentaire> commentaires;


}

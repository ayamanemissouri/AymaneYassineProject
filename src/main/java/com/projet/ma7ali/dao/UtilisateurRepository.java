package com.projet.ma7ali.dao;

import com.projet.ma7ali.entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

}

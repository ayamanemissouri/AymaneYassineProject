package com.projet.ma7ali.web;

import com.projet.ma7ali.dao.UtilisateurRepository;
import com.projet.ma7ali.entites.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @GetMapping("/users")
    public List<Utilisateur> findUsers()
    {
        return utilisateurRepository.findAll();
    }
    

}

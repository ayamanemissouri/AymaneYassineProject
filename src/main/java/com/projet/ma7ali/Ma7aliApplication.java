package com.projet.ma7ali;

import com.projet.ma7ali.dao.UtilisateurRepository;
import com.projet.ma7ali.entites.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Ma7aliApplication implements CommandLineRunner {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public static void main(String[] args) {
        SpringApplication.run(Ma7aliApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Utilisateur user=new Utilisateur(null,"Yassine","Prenom","tiflet99","sdlfkjsdlfj@sdfsf",new Date(),065656565);
        utilisateurRepository.save(user);
    }
}

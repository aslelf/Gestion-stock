package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Adresse;
import com.elfanass.gestiondestock.model.Entreprise;
import com.elfanass.gestiondestock.model.Roles;
import com.elfanass.gestiondestock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class RolesDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private String dateDeNaissance;

    private String motDePasse;

    private Adresse adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;

}

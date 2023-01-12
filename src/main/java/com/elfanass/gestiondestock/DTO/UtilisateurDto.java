package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Adresse;
import com.elfanass.gestiondestock.model.Entreprise;
import com.elfanass.gestiondestock.model.Roles;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class UtilisateurDto {

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

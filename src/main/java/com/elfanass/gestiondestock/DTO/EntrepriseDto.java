package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Adresse;
import com.elfanass.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private Adresse adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String siteweb;

    private List<UtilisateurDto> utilisateur;

}

package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Builder
@Data
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeClientDto> commandeClients;

}

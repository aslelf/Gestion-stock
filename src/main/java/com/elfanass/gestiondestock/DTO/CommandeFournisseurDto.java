package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Fournisseur;
import com.elfanass.gestiondestock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Builder
@Data
public class CommandeFournisseurDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private Fournisseur fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;


}

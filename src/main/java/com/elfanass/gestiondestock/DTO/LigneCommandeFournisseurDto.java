package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Article;
import com.elfanass.gestiondestock.model.CommandeFournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}

package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Article;
import com.elfanass.gestiondestock.model.CommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeClientDto {

    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;


}

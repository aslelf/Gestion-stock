package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Ventes;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

}

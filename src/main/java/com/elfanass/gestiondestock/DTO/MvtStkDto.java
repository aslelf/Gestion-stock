package com.elfanass.gestiondestock.DTO;

import com.elfanass.gestiondestock.model.Article;
import com.elfanass.gestiondestock.model.TypeMvtStk;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStkDto {

    private Integer id;

    private Article article;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvt;
}

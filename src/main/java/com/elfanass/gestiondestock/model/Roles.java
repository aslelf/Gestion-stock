package com.elfanass.gestiondestock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="roles")
@EqualsAndHashCode(callSuper = true)
public class Roles extends AbstractEntity{

    @Column(name = "rolename")
    private String rolename;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;


}

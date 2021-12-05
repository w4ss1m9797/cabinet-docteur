package com.cd.cabinet.docteur.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Medicament {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code;


    private com.cd.cabinet.docteur.Utilities.medType medType;


    private String nom;
}

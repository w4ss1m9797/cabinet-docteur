package com.cd.cabinet.docteur.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedPrescription {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code ;

    @OneToOne(cascade = CascadeType.ALL)
    private Medicament medicament;

    private Double dosage;

    private Integer nbrUse;

    private Integer daysToTake;


    @ManyToOne
    @JoinColumn(name = "prescription_ID")
    private Prescription prescription;


}

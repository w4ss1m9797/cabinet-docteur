package com.cd.cabinet.docteur.domain;

import com.cd.cabinet.docteur.Utilities.Motif;
import com.cd.cabinet.docteur.Utilities.TypeConsultation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consultation {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code;

    private Motif motif;

    private LocalDate date;

    private Double weight;

    private Double temperature;

    private Double tension;

    private TypeConsultation typeConsultation;


    @ManyToOne
    @JoinColumn(name = "dossier_med_code")
    private DossierMed dossierMed;

    @OneToOne(cascade = CascadeType.ALL)
    private Prescription prescription;


}

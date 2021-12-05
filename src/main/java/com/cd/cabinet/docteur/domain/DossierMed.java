package com.cd.cabinet.docteur.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DossierMed {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Consultation> consultations ;


    @ManyToOne
    @JoinColumn(name = "patient_code")
    private Patient patient;



}

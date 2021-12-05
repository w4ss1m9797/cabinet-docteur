package com.cd.cabinet.docteur.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code ;

    private LocalDate date;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<MedPrescription> medPrescription;

}

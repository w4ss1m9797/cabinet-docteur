package com.cd.cabinet.docteur.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedCertif {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "patient_code")
    private Patient patient;
}

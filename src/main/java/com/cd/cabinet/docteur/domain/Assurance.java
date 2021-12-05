package com.cd.cabinet.docteur.domain;


import com.cd.cabinet.docteur.Utilities.TypeSec;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Assurance {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer num_sec ;

    private TypeSec typeSec;

    private LocalDate startDate;

    private LocalDate endDate;




}

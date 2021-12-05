package com.cd.cabinet.docteur.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code;

    private LocalDateTime time;



    @OneToOne
    private Patient patient;


}

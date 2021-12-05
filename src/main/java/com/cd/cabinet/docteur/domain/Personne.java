package com.cd.cabinet.docteur.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@MappedSuperclass
public class Personne {

    //@Id(GenerationType = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer code;

    private Integer cin;

    private String firstName;

    private String lastName;

    private LocalDate dateNaiss;

    private String login;

    private String pwd;

    private String mail;

    private Integer telephone;







}

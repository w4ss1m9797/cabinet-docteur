package com.cd.cabinet.docteur.Utilities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class HospitalLetter {

    private String hospitalName;

    private String address;

    private LocalDate startDate;

    private LocalDate endDate;
}

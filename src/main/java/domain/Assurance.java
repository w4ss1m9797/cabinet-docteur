package domain;


import Utilities.TypeSec;
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


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer num_sec ;

    private TypeSec typeSec;

    private LocalDate startDate;

    private LocalDate endDate;




}

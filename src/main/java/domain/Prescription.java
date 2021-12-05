package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code ;

    private LocalDate date;

    @OneToMany(cascade = CascadeType.ALL)
    private MedPrescription medPrescription;

}

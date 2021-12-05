package domain;

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
public class DossierMed {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Consultation> consultations ;


    @ManyToOne
    @JoinColumn(name = "patient_code")
    private Patient patient;



}

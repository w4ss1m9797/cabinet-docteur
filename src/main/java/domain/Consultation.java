package domain;

import Utilities.Motif;
import Utilities.TypeConsultation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consultation {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code;

    private Motif motif;

    private LocalDate date;

    private Double weight;

    private Double temperature;

    private Double tension;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeConsultation typeConsultation;


    @ManyToOne
    @JoinColumn(name = "dossier_med_code")
    private DossierMed dossierMed;

    @OneToOne(cascade = CascadeType.ALL)
    private Prescription prescription;


}

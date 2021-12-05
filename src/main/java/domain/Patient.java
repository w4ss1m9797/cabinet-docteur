package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient extends Personne{


    @OneToOne(cascade = CascadeType.ALL)
    private DossierMed dossierMed;

    @OneToOne(cascade = CascadeType.ALL)
    private Assurance assurance;

    @OneToMany(cascade = CascadeType.ALL)
    private Collection<MedCertif> medCertifs;


    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Appointment> appointments;

}

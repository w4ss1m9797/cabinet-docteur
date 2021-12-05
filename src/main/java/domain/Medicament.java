package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Medicament {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code;


    private Utilities.medType medType;


    private String nom;
}

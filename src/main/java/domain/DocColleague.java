package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocColleague {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code;

    private String nom;

    private String prenom;

    private String mail;

    private Integer telephone;

    private String specialite;

    private String address;

}

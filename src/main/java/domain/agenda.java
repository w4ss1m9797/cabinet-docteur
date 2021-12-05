package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class agenda {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code;


    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Appointment> appointments;



}

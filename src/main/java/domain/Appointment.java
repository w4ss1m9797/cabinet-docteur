package domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code;

    private LocalDateTime time;



    @OneToOne
    private Patient patient;


}

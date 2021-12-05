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
public class Hospital {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer code;

    private String name;

    private String address;



}

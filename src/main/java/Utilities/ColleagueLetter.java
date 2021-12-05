package Utilities;

import domain.DocColleague;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ColleagueLetter {

    private DocColleague docColleague;

    private String object;

    private String description;
}

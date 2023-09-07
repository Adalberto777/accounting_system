package program;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String name;
    private LocalDate dob;
    private TypeAnimal type;
    private PurposeAnimal purpose;
}

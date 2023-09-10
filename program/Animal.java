package program;

import lombok.Data;

import java.time.LocalDate;
@Data

public class Animal {
    private String name;
    private LocalDate dob;
    private TypeAnimal type;
    private PurposeAnimal purpose;

    public Animal(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }
}

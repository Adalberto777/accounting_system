package program;

import java.time.LocalDate;

public class Hamster extends Animal{
    public Hamster(String name, LocalDate dob) {
        super(name, dob);
        setType(TypeAnimal.HAMSTER);
        setPurpose(PurposeAnimal.PET);
    }
}

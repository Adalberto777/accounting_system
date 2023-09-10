package program;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, LocalDate dob) {
        super(name, dob);
        setType(TypeAnimal.DOG);
        setPurpose(PurposeAnimal.PET);
    }
}

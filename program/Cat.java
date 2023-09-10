package program;

import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, LocalDate dob) {
        super(name, dob);
        setType(TypeAnimal.DOG);
        setPurpose(PurposeAnimal.PET);
    }
}

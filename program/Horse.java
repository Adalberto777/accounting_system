package program;

import java.time.LocalDate;

public class Horse extends Animal{
    private int cargo;
    public Horse(String name, LocalDate dob, int cargo) {
        super(name, dob);
        this.cargo = cargo;
        setType(TypeAnimal.HORSE);
        setPurpose(PurposeAnimal.PACK);
    }
}

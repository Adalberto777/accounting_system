package program;

import java.time.LocalDate;

public class Camel extends Animal{
    private int cargo;
    public Camel(String name, LocalDate dob, int cargo) {
        super(name, dob);
        this.cargo = cargo;
        setType(TypeAnimal.CAMEL);
        setPurpose(PurposeAnimal.PACK);
    }
}

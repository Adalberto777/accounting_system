package program;

import java.time.LocalDate;

public class Donkey extends Animal{
    private int cargo;

    public Donkey(String name, LocalDate dob, int cargo) {
        super(name, dob);
        this.cargo = cargo;
        setType(TypeAnimal.DONKEY);
        setPurpose(PurposeAnimal.PACK);
    }
}

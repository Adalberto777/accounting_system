package program;

import java.time.LocalDate;
import java.util.Scanner;

import static program.ReadInputData.readDateOfBirth;
import static program.ReadInputData.readName;
import static program.WriteInputData.writeData;

public class Camel extends Animal{

    public Camel(String name, LocalDate dob) {
        super(name, dob);
        setType(TypeAnimal.CAMEL);
        setPurpose(PurposeAnimal.PACK);
    }

    public static void addNewCamel(){
        Scanner scanner = new Scanner(System.in);
        String name = readName();

        scanner.nextLine();

        LocalDate dob = readDateOfBirth();
        Camel camel = new Camel(name, dob);

        writeData(camel);
    }
}

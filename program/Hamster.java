package program;

import java.time.LocalDate;
import java.util.Scanner;

import static program.ReadInputData.readDateOfBirth;
import static program.ReadInputData.readName;
import static program.WriteInputData.writeData;

public class Hamster extends Animal{
    public Hamster(String name, LocalDate dob) {
        super(name, dob);
        setType(TypeAnimal.HAMSTER);
        setPurpose(PurposeAnimal.PET);
    }

    public static void addNewHamster(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кличку собаки:");
        String name = readName();

        scanner.nextLine();

        System.out.println("Введите дату рождения в формате yyyy.MM.dd");
        LocalDate dob = readDateOfBirth();
        Hamster hamster = new Hamster(name, dob);

        writeData(hamster);
    }
}

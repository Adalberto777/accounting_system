package program;

import java.time.LocalDate;
import java.util.Scanner;

import static program.ReadInputData.readDateOfBirth;
import static program.ReadInputData.readName;
import static program.WriteInputData.writeData;

public class Horse extends Animal{

    public Horse(String name, LocalDate dob) {
        super(name, dob);
        setType(TypeAnimal.HORSE);
        setPurpose(PurposeAnimal.PACK);
    }

    public static void addNewHorse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кличку собаки:");
        String name = readName();

        scanner.nextLine();

        System.out.println("Введите дату рождения в формате yyyy.MM.dd");
        LocalDate dob = readDateOfBirth();
        Horse horse = new Horse(name, dob);

        writeData(horse);
    }
}

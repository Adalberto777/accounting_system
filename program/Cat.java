package program;

import java.time.LocalDate;
import java.util.Scanner;

import static program.ReadInputData.readDateOfBirth;
import static program.ReadInputData.readName;
import static program.WriteInputData.writeData;

public class Cat extends Animal{
    public Cat(String name, LocalDate dob) {
        super(name, dob);
        setType(TypeAnimal.CAT);
        setPurpose(PurposeAnimal.PET);
    }

    public static void addNewCat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кличку собаки:");
        String name = readName();

        scanner.nextLine();

        System.out.println("Введите дату рождения в формате yyyy.MM.dd");
        LocalDate dob = readDateOfBirth();
        Cat cat = new Cat(name, dob);

        writeData(cat);
    }
}

package program;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ReadInputData {
    public static String readName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();

        while (checkString(name)) {
            return  name;
        }
        return name;
    }

    public static LocalDate readDateOfBirth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of birth in format yyyy.mm.dd: ");
        String dateOfBirthString = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        LocalDate dob = LocalDate.parse(dateOfBirthString, formatter);

        return dob;
    }

    public static char readSex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sex, 'm' for male or 'f' for female: ");
        String sexString = scanner.next();
        char sex = sexString.charAt(0);
        while (sexString.length() != 1 & (sex != 'm' && sex != 'f')) {
            System.out.println("Invalid input, please enter 'm' for male or 'f' for female: ");
            sex = scanner.next().charAt(0);
        }

        return sex;
    }

    /**
     *  the method checks the string for correctness
     *
     * @param str string for checking
     *
     * @return boolean
     */
    public static boolean checkString(String str){
        if (!str.matches("[a-zA-Z\\-]+") || (str == null)) {
            System.out.println("Invalid input. Please enter only letters and hyphens and name cannot be null.");
            return false;
        }
        return true;
    }

}

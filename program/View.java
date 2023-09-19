package program;

import java.util.InputMismatchException;
import java.util.Scanner;

import static program.Camel.addNewCamel;
import static program.Cat.addNewCat;
import static program.Dog.addNewDog;
import static program.Donkey.addNewDonkey;
import static program.Hamster.addNewHamster;
import static program.Horse.addNewHorse;

public class View {
    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Меню:");
                System.out.println("1. Добавить новое животное");
                System.out.println("2. Показать список всех животных");
                System.out.println("3. Просмотреть список команд животного");
                System.out.println("4. Обучить животное новой команде");
                System.out.println("0. Выход");
                System.out.print("Выберите пункт меню: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> addNewAnimalMenu();
//                    case 2 -> database.displayAllAnimals();
//                    case 3 -> displayAnimalCommands();
//                    case 4 -> teachNewCommand();
                    case 0 -> {
                        System.out.println("Программа завершена.");
                        return;
                    }
                    default -> System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода. Попробуйте снова.");
                scanner.nextLine(); // Очистка буфера сканера после ошибочного ввода
            }
        }
    }
    public static void addNewAnimalMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Меню создания нового животного:");
                System.out.println("1. Добавить собаку");
                System.out.println("2. Добавить кошку");
                System.out.println("3. Добавить хомяка");
                System.out.println("4. Добавить лошадь");
                System.out.println("5. Добавить осла");
                System.out.println("6. Добавить верблюда");
                System.out.println("0. Вернутся в главное меню");
                System.out.print("Выберите пункт меню: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> addNewDog();
                    case 2 -> addNewCat();
                    case 3 -> addNewHamster();
                    case 4 -> addNewHorse();
                    case 5 -> addNewDonkey();
                    case 6 -> addNewCamel();
                    case 0 -> mainMenu();
                    default -> System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода. Попробуйте снова.");
                scanner.nextLine(); // Очистка буфера сканера после ошибочного ввода
            }
        }
    }
}

package program;

import com.sun.source.tree.AnnotatedTypeTree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("pes", LocalDate.of(2023,1,15), TypeAnimal.DOG, PurposeAnimal.PET);
    }
}

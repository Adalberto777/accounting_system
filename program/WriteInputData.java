package program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInputData {
    public static void writeData(Animal animal){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("AllAnimals.txt", true));

            writer.write("<" + animal.getName() + ">");
            writer.write("<" + animal.getDob() + ">");
            writer.write("<" + animal.getType() + ">");
            writer.write("<" + animal.getPurpose() + ">");
            writer.write("<" + animal.getClass() + ">");


            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file!" + e);
        }
    }

}

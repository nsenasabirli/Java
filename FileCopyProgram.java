import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyProgram {
    public static void copyPersonalInfo(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "/Users/nahidesenasabirli/Downloads/NAHİDE SENA SABIRLI.pdf";  // Replace with the path to your input file
        String outputFilePath = "/Users/nahidesenasabirli/Downloads/database.pdf";  // Replace with the path to your output file

        copyPersonalInfo(inputFilePath, outputFilePath);
    }
}
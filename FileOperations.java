import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        String directoryPath = "/Users/nahidesenasabirli/Downloads";
        String fileName = "Test.txt";

        // Create a File object with the directory path and file name
        File file = new File(directoryPath, fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("<Java File Operations>");
            System.out.println("-> There is a related file in the directory you have specified.");
            System.out.println("File Name: " + file.getAbsolutePath());
            System.out.println("Directory Path of the File: " + file.getParent());
        } else {
            // Create the file if it doesn't exist
            try {
                if (file.createNewFile()) {
                    System.out.println("<Java File Operations>");
                    System.out.println("-> The file has been created successfully.");
                    System.out.println("File Name: " + file.getAbsolutePath());
                    System.out.println("Directory Path of the File: " + file.getParent());
                } else {
                    System.out.println("Unable to create the file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }
    }
}
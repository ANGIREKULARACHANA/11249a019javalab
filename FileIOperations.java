import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a file operations program.");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("\nFile contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            FileWriter append = new FileWriter(file, true);
            append.write("\nThis line is appended to the file.");
            append.close();

            System.out.println("\nData appended successfully.");

            File newFile = new File("new_example.txt");

            if (file.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            }

            if (newFile.delete()) {
                System.out.println("File deleted successfully.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

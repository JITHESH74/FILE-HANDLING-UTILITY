package filehandlingsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrate file operations (read,write,modify) for a grade tracking system
 */
public class FileHandling {
    public static void main(String[] args) {
        String fileName = "grade.txt";
        writeToFile(fileName);
        readFromFile(fileName);
        modifyFromFile(fileName);

    }

    /**
     * write sample grade data to text file
     * @param fileName name of the file to be created
     */
    public static void writeToFile(String fileName){
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("jithu: 86\n");
            writer.write("kichu: 90\n");
            writer.write("arya: 95\n");
            writer.close();
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }

    /**
     * Reads and print the content of the text files
     * @param fileName the name of the file to be read
     */
    public static void readFromFile(String fileName){
        try{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = reader.readLine()) !=null){
            System.out.println(line);
            }
            reader.close();
    }
        catch(IOException e){
            System.out.println("Error reading from file");
            e.printStackTrace();
        }
    }

    /**
     * modify a specific entry in the text file
     * @param fileName the name of the file to be modified
     */
    public static void modifyFromFile(String fileName){
        try{
            List<String> lines = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) !=null){
                if(line.startsWith("jithu")){
                    line = "Arun : 50\n";
                }
                lines.add(line);
            }
            reader.close();
            FileWriter writer = new FileWriter(fileName);
            for(String updatedLine : lines){
                writer.write(updatedLine + "\n");
            }
            writer.close();
            System.out.println("File modified successfully");
        }
        catch(IOException e){
            System.out.println("Error modifying the file");
        }
    }
}

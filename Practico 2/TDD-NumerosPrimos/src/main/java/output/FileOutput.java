package output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutput implements InterfazOutput {
    private String archiveName;

    public FileOutput(String archiveName) {
        this.archiveName = archiveName;
    }

    @Override
    public void print(List<Integer> toPrint) {
        try {
            FileWriter fileWriter = new FileWriter(archiveName);
            fileWriter.write("Prime Numbers: " + toPrint);
            fileWriter.close();
            System.out.println("Se ha escrito la salida en el archivo '" + archiveName + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

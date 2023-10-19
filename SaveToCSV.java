
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveToCSV {
    public static void save(String path, ArrayList<String> currentBook) {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (String s : currentBook) {
                writer.append(s);
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

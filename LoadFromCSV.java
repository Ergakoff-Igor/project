import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadFromCSV {

    public ArrayList<String> load(String path) {
        ArrayList <String> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            scanner.useDelimiter("; ");
            while (scanner.hasNext()) {
                values.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return values;
    }

}

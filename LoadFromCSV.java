import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadFromCSV {
    DateFormater dateFormater = new DateFormater();
    NoteBook currentBook = new NoteBook();
    Note note;

    public NoteBook load(String path) {
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                currentBook.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return currentBook;
    }

    public Note getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(" -> ");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
            note = new Note(dateFormater.StringToLocalDateTime(values.get(0)), values.get(1));
        }
        return note;
    }
}

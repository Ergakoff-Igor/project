import java.io.FileWriter;
import java.io.IOException;

import ru.gb.ergakov.Infrastructure.NoteBook;
import ru.gb.ergakov.Models.Note;

public class SaveToCSV {
    DateFormater dateFormater = new DateFormater();
    public void save(String path, NoteBook currentBook) {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Note note = currentBook.getNote(i);
                writer.append(String.format("%s -> ", dateFormater.LocalDateTimeToString(note.getDate())));
                writer.append(String.format("%s\n", note.getDescription()));
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static void menu() throws Exception {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        ArrayList <String> newNote = new ArrayList<>();
        switch (x) {
            case 1:
                SaveToCSV.save(Config.pathDb,newNote);
            case 2:
                System.out.println(Config.pathDb);
        }
    }
}
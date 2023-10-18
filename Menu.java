import java.io.IOException;
import java.util.Scanner;

public class Menu extends Main {
    public static void menu() throws Exception {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        switch (x) {
            case 1:
                Writer.writer();
            case 2:
                Read.read();
        }
    }
}
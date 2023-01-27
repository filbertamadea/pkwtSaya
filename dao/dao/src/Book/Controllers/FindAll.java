package Book.Services;

import Book.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindAll extends Menu {

    public static void Get() {
        File file = new File(fileName);
        Scanner sc = new Scanner(System.in);

        book.clear();
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            book.add(data);
        }
    }
}
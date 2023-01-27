package Book.Repository;

import Book.Main;
import Book.Models.ReadBook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class bookController extends Main {

    public static ArrayList<String> showBook() {
        ReadBook readBook = new ReadBook();
        clearScreen();
        readBook.readBookList();
        if (book.size() > 0) {
            System.out.println("TODO LIST:");
            int index = 0;
            for (String data : book) {
                System.out.println(String.format("[%d] %s", index, data));
                index++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            backToMenu();
        }
        return book;
    }

    public static ArrayList<String> saveBook() {
        clearScreen();
        Scanner sc = new Scanner(System.in);
        System.out.println("Apa yang ingin kamu kerjakan?");
        System.out.print("Jawab: ");
        String input = sc.nextLine();

        try {
            // tulis file
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.append(String.format("%s%n", input));
            fileWriter.close();

            System.out.println("Berhasil ditambahkan!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
        backToMenu();
        return null;
    }
    public static ArrayList<String> editBook() {
        ReadBook readBook = new ReadBook();
        isEditing = true;
        readBook.readBookList();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(sc.nextLine());

            if (index > book.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.print("Data baru: ");
                String newData = sc.nextLine();

                // update data
                book.set(index, newData);

                System.out.println(book.toString());

                try {
                    FileWriter fileWriter = new FileWriter(fileName, false);

                    // write new data
                    for (String data : book) {
                        fileWriter.append(String.format("%s%n", data));
                    }
                    fileWriter.close();

                    System.out.println("Berhasil diubah!");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
        return null;
    }
    public static ArrayList<String> deleteBook() {
        ReadBook readBook = new ReadBook();
        isEditing = true;
        readBook.readBookList();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(sc.nextLine());

        try {
            if (index > book.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus:");
                System.out.println(String.format("[%d] %s", index, book.get(index)));
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = sc.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    book.remove(index);

                    // tulis ulang file
                    try {
                        FileWriter fileWriter = new FileWriter(fileName, false);

                        // write new data
                        for (String data : book) {
                            fileWriter.append(String.format("%s%n", data));
                        }
                        fileWriter.close();

                        System.out.println("Berhasil dihapus!");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();
        return null;
    }
}

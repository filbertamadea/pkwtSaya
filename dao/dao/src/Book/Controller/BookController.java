package Book.Services;

import Book.Repository.BookRepo;
import Book.Controller.BookController;

import java.util.ArrayList;

public class BookServices implements BookController {

    public static ArrayList<String> findALl() {
        return BookRepo.showBook();
    }

    @Override
    public String findById() {
        return null;
    }

    public static ArrayList<String> saveBook() {
        return BookRepo.saveBook();
    }

    public static ArrayList<String> editBook() {
        return BookRepo.editBook();
    }

    public static ArrayList<String> deleteBook() {
        return BookRepo.deleteBook();
    }
}

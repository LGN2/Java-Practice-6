import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LibraryBookTracker {
    public static void main(String[] args) {

        Set<Integer> bookIds = new HashSet<>();

        Map<Integer, String> books = new HashMap<>();

        addBook(bookIds, books, 101, "Java Basics");
        addBook(bookIds, books, 102, "Python Fundamentals");
        addBook(bookIds, books, 103, "Database Systems");
        addBook(bookIds, books, 104, "Web Development");
        addBook(bookIds, books, 103, "Another Book");

        IO.println("\n========== LIBRARY BOOK TRACKER ==========");

        for (Map.Entry<Integer, String> book : books.entrySet()) {

            IO.println(
                    "Book ID: " + book.getKey()
                            + " | Title: "
                            + book.getValue()
            );
        }

        IO.println("\nTotal Books: " + books.size());
    }
    public static void addBook(
            Set<Integer> bookIds,
            Map<Integer, String> books,
            int id,
            String title) {

        if (bookIds.add(id)) {

            books.put(id, title);

            IO.println(
                    title + " added successfully."
            );

        } else {

           IO.println(
                    "Book ID "
                            + id
                            + " already exists."
            );
        }
    }
}

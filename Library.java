import java.util.ArrayList;
import java.util.List;

public class Library {
    private String Name;
    private String Location;
    private List<String> Books;
    public Library (String name, String location) {
        this.Name = name;
        this.Location = location;
        this.Books = new ArrayList<>();
    }
    public void  addBook(String book) {
        Books.add(book);
    }
           public void checkOutBook(String book) {
            if (Books.contains(book)) {
                Books.remove(book);
            } else {
                System.out.println("Sorry, that book is not in the library.");
            }
        }

        public void displayBooks() {
            System.out.println("Books in the " + Name + " library at " + Location + ":");
            for (String book : Books) {
                System.out.println(book);
            }
    }
}
class DemoLibrary {
    public static void main(String[] args) {
        Library library = new Library("Matenadarn", "Koryun str. 18");
        library.addBook("Bible");
        library.addBook("Da Vinci Code,The");
        library.addBook("Harry Potter and the Philosopher's Stone");
        library.checkOutBook("Da Vinci Code,The");
        library.displayBooks();
    }
}

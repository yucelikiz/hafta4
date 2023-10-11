import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Great Gatsby", "F. Scott Fitzgerald",1925, 270));
        bookSet.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 315));
        bookSet.add(new Book("Catcher in the Rye", "J. D. Salinger", 1951, 234));
        bookSet.add(new Book("Grapes of Wrath", "John Steinbeck", 1939, 464));
        bookSet.add(new Book("Adventures of Huckleberry Finn", "Mark Twain", 1884, 362));


        System.out.println("Kitaplar isimlerine göre sıralanmıştır :");
        Set<Book> sortByName = new TreeSet<>(bookSet);
        System.out.println(sortByName);

        Set<Book> sortByPage = new TreeSet<>(Comparator.comparingInt(book -> book.pageCount));
        sortByPage.addAll(bookSet);

        System.out.println("Kitaplar sayfa sayısına göre sıralanmıştır :");
        System.out.println(sortByPage);
    }
}
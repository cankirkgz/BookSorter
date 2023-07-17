import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSetName = new TreeSet<>(new CompareBookName());

        bookSetName.add(new Book("Kelebeğin Doğuşu", 670, "Can Kırkgöz", "05/04/2023"));
        bookSetName.add(new Book("Alacakaranlık", 150, "Author2", "2022-02-02"));
        bookSetName.add(new Book("Dünyanın Sonu", 300, "Author3", "2020-03-03"));
        bookSetName.add(new Book("Aynı Yıldızın Altında", 250, "Author4", "2023-04-04"));
        bookSetName.add(new Book("Marslı", 180, "Author5", "2019-05-05"));

        System.out.println("Books sorted by name:");
        for (Book book : bookSetName) {
            System.out.println(book.getBookName());
        }

        Set<Book> bookSetPageCount = new TreeSet<>(new ComparePageCount());

        bookSetPageCount.add(new Book("Kelebeğin Doğuşu", 670, "Can Kırkgöz", "05/04/2023"));
        bookSetPageCount.add(new Book("Alacakaranlık", 150, "Author2", "2022-02-02"));
        bookSetPageCount.add(new Book("Dünyanın Sonu", 300, "Author3", "2020-03-03"));
        bookSetPageCount.add(new Book("Aynı Yıldızın Altında", 250, "Author4", "2023-04-04"));
        bookSetPageCount.add(new Book("Marslı", 180, "Author5", "2019-05-05"));

        System.out.println("\nBooks sorted by page count:");
        for (Book book : bookSetPageCount) {
            System.out.println(book.getBookName());
        }
    }
}


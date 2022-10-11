import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name;
    List<String> paragraphs;
    List<String> images;
    List<String> tables;
    List<String> book;

    public Book(String name) {
        this.name = name;
        this.paragraphs = new ArrayList<String>();
        this.images = new ArrayList<String>();
        this.tables = new ArrayList<String>();
        this.book = new ArrayList<String>();
        book.add(name);
    }

    public void createNewParagraph(String paragraph) {
        paragraphs.add(paragraph);
        book.add(paragraph);
    }

    public void createNewImage(String image) {
        images.add(image);
        book.add(image);
    }

    public void createNewTable(String table) {
        tables.add(table);
        book.add(table);
    }

    public void print() {
        System.out.println(book);
    }
}

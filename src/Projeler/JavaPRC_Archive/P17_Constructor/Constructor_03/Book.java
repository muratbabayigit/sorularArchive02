package Projeler.JavaPRC_Archive.P17_Constructor.Constructor_03;
// Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır.

// Örnek çıktı:
// Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Aydın (2022)
public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programlama", "Ahmet Aydın", 2022);
        System.out.println("Book nesnesi oluşturuldu: \"" + book.title + "\" - " + book.author + " (" + book.publicationYear + ")");
    }
}

package Projeler.JavaPRC_Archive.practice_day07;

public class Book {
// Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır.
// Örnek çıktı:
// Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)
        String title;
        String yazar;
        int yayinYili;

        public Book (String title, String yazar, int yayinYili){
                this.title=title;
                this.yazar=yazar;
                this.yayinYili=yayinYili;
        }

        public static void main(String[] args) {
                Book book=new Book("Java Programlama","Ahmet Bulutluöz",2021);
                System.out.println("Yeni Kitap Eklendi:\n Kitap Bilgileri:\n"+book.title+"-"+book.yazar+"-"+book.yayinYili );
                Book book2=new Book("babayigit","java practice",2022);
                System.out.println("Yeni Kitap Eklendi:\n Kitap Bilgileri:\n"+book2.title+"-"+book2.yazar+"-"+book2.yayinYili );
        }
}


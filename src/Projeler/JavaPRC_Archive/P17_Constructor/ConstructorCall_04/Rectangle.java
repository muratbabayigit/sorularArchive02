package Projeler.JavaPRC_Archive.P17_Constructor.ConstructorCall_04;
// Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

// Örnek çıktı:
// Uzunluk: 8, Genişlik: 6
// Kenar uzunluğu: 5 (Kare)
public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        display();
    }

    public Rectangle(int side) {
        this.length = side;
        this.width = side;
        display();
    }

    public void display() {
        System.out.println("Uzunluk: " + length + ", Genişlik: " + width);
        if (length == width) {
            System.out.println("Kenar uzunluğu: " + length + " (Kare)");
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(8, 6);
        Rectangle rectangle2 = new Rectangle(5);
    }
}

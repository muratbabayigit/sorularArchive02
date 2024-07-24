package Projeler.JavaPRC_Archive.practice_day08;
// Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructorlarin içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

// Örnek çıktı:
// Uzunluk: 8, Genişlik: 6
// Kenar uzunluğu: 5 (Kare)

public class Rectangle {
    int length;
    int width;


    public Rectangle (int length, int width){
        this.length=length;
        this.width=width;
        display();
    }
    public Rectangle(int side){
        this.length=side;
        this.width=side;
        display();
    }

    public void display() {
        if (length==width){
            System.out.println("Kenar uzunluğu: "+width+" (Kare)");
        }else {
            System.out.println("Uzunluk: " + length + ", Genişlik: " + width);
        }

    }

    public static void main(String[] args) {
       // Rectangle rec1=new Rectangle(8,6);
        //Rectangle rec2=new Rectangle(9);
        Rectangle rec3=new Rectangle(9,9);

    }
}

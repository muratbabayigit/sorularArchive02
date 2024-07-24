package Projeler.JavaPRC_Archive.P17_Constructor.ConstructorCall_04;
// Bir "Point" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, x ve y koordinatlarını alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak koordinatları ekrana yazdırın.

// Örnek çıktı:
// X: 5, Y: 10
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        display();
    }

    public void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void main(String[] args) {
        Point point = new Point(5, 10);
    }
}

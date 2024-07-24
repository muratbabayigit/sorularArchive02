package Projeler.JavaPRC_Archive.P17_Constructor.ConstructorCall_04;
// Bir "Student" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, ad ve yaş bilgilerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece ad bilgisini alacak şekilde tasarlanmalıdır (yaş varsayılan olarak 18).

// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak öğrenci bilgilerini ekrana yazdırın.

// Örnek çıktı:
// Öğrenci: Ali (18 yaşında)
// Öğrenci: Mehmet (25 yaşında)
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        display();
    }

    public Student(String name) {
        this.name = name;
        this.age = 18;
        display();
    }

    public void display() {
        System.out.println("Öğrenci: " + name + " (" + age + " yaşında)");
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ali");
        Student student2 = new Student("Mehmet", 25);
    }

}

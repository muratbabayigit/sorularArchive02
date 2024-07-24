package Projeler.JavaPRC_Archive.P17_Constructor.Constructor_03;




        // Bir "Person" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, ad ve yaş bilgilerini alacak şekilde tasarlanmalıdır.

// Örnek çıktı:
// Person nesnesi oluşturuldu: Ahmet (25 yaşında)
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Ahmet", 25);
        System.out.println("Person nesnesi oluşturuldu: " + person.name + " (" + person.age + " yaşında)");
    }
}


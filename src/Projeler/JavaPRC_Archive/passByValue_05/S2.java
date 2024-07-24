package Projeler.JavaPRC_Archive.passByValue_05;

public class S2 {
    // Soru: Bir nesnenin içeriğini değiştirmek için nesnenin referansının nasıl geçirileceğini
// gösteren bir örnek yapınız.


    public static void main(String[] args) {
        Person person = new Person("Ahmet"); // Yeni bir Person nesnesi oluşturuluyor.
        System.out.println("Başlangıç İsim: " + person.getName());
        changePersonName(person); // Metoda nesnenin referansı geçiriliyor.
        System.out.println("Son İsim: " + person.getName());
    }

    static void changePersonName(Person p) {
        p.setName("Mehmet"); // Metot içindeki değişiklik orijinal nesneyi etkiler.
        System.out.println("Metot İçinde İsim: " + p.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}


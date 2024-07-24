package Projeler.JavaPRC_Archive.P19_ImmutableClasses.ImmutableClass_06;

public class S2 {
    // Soru: Immutable sınıfların avantajları nelerdir? Neden ve nasıl kullanılırlar?
// Immutable sınıfların güvenlik ve performans açısından faydalarını anlatan bir örnek yapınız.


        public static void main(String[] args) {
            Person person = new Person("Alice", 25);
            System.out.println("Başlangıç: " + person.getName() + ", " + person.getAge() + " yaşında");

            Person modifiedPerson = changePersonAge(person, 30);
            System.out.println("Orijinal değiştirilmedi: " + person.getName() + ", " + person.getAge() + " yaşında");
            System.out.println("Değiştirilen: " + modifiedPerson.getName() + ", " + modifiedPerson.getAge() + " yaşında");
        }

        static Person changePersonAge(Person p, int newAge) {
            return new Person(p.getName(), newAge);
        }
    }

    final class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }



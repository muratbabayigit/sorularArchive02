package Projeler.JavaPRC_Archive.P17_Constructor.Constructor_03;
// Bir "Student" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, öğrenci adını ve okul numarasını alacak şekilde tasarlanmalıdır.

// Örnek çıktı:
// Student nesnesi oluşturuldu: Ali (123456)
public class Student {
    String name;
    int studentNumber;

    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public static void main(String[] args) {
        Student student = new Student("Ali", 123456);
        System.out.println("Student nesnesi oluşturuldu: " + student.name + " (" + student.studentNumber + ")");
    }
}


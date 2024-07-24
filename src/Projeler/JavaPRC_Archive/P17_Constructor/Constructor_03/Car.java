package Projeler.JavaPRC_Archive.P17_Constructor.Constructor_03;
// Bir "Car" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, marka ve model bilgilerini alacak şekilde tasarlanmalıdır.

// Örnek çıktı:
// Car nesnesi oluşturuldu: Ford Focus
public class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus");
        System.out.println("Car nesnesi oluşturuldu: " + car.brand + " " + car.model);
    }
}

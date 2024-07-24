package Projeler.JavaPRC_Archive.passByValue_05;

public class S3 {
    // Soru: Referans veri tiplerinin nasıl çalıştığını anlamak için bir nesnenin bir metoda
// geçirilmesinin orijinal nesneyi nasıl etkilemediğini gösteren bir örnek yapınız.


        public static void main(String[] args) {
            StringBuilder text = new StringBuilder("Merhaba"); // Başlangıç metni atanıyor.
            System.out.println("Başlangıç Metni: " + text);
            modifyText(text); // Metoda referans geçiriliyor.
            System.out.println("Son Metin: " + text);
        }

        static void modifyText(StringBuilder str) {
            str.append(" Java"); // Metot içindeki değişiklik orijinal nesneyi etkiler.
            System.out.println("Metot İçinde: " + str);
        }
    }


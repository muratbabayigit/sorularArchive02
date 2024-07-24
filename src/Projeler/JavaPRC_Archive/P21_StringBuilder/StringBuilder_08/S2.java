package Projeler.JavaPRC_Archive.P21_StringBuilder.StringBuilder_08;

public class S2 {
    // Soru: Verilen bir metni tersten yazdıran bir fonksiyonu nasıl yazarsınız?
// StringBuilder kullanarak bir metni ters çeviren bir örnek yapınız.


        public static void main(String[] args) {
            String originalText = "Hello, World!";
            String reversedText = reverseString(originalText);
            System.out.println("Ters Çevrilmiş Metin: " + reversedText);
        }

        static String reverseString(String text) {
            StringBuilder reversed = new StringBuilder(text);
            return reversed.reverse().toString(); // StringBuilder'ın reverse metodu ile ters çeviriyoruz.
        }
    }



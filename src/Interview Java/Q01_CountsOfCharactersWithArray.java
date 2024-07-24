import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
        Task-> Girilen bir String value için  herbir character'in sayisini print eden code create ediniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
               abaa   ==> a=3  b=1
       */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string girin: ");
        String str = scanner.nextLine();
        scanner.close();

        // Her karakterin sayısını tutmak için bir Map oluşturuyoruz
        Map<Character, Integer> karakterSayilari = new HashMap<>();

        // String üzerinde döngü yaparak her bir karakterin sayısını buluyoruz
        for (int i = 0; i < str.length(); i++) {
            char karakter = str.charAt(i);

            // Eğer karakter daha önce haritada mevcut ise, sayısını bir arttırıyoruz
            if (karakterSayilari.containsKey(karakter)) {
                karakterSayilari.put(karakter, karakterSayilari.get(karakter) + 1);
            }
            // Eğer karakter daha önce haritada yoksa, 1 olarak ekliyoruz
            else {
                karakterSayilari.put(karakter, 1);
            }
        }

        // Sonuçları yazdırıyoruz
        for (Map.Entry<Character, Integer> entry : karakterSayilari.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

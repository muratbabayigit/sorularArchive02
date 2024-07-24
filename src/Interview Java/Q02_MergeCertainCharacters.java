import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        System.out.println(returnFirstAndLast("Murat", 5)); // eaea

    }

    public static String returnFirstAndLast(String str, int count) {
        StringBuilder result = new StringBuilder();

        // İlk harfi alıyoruz
        char firstChar = str.charAt(0);
        // Son harfi alıyoruz
        char lastChar = str.charAt(str.length() - 1);

        // İlk harfi ve son harfi sırayla ekleyip bu işlemi count kez tekrar ediyoruz
        for (int i = 0; i < count; i++) {
            result.append(firstChar);
            result.append(lastChar);
        }

        return result.toString();
    }//main sonu


}//class sonu

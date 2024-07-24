package Projeler.JavaPRC_Archive.practice_day05;

import java.util.Scanner;

public class PalindromKontrol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı, kelime veya cümle giriniz:");
        String giris = scanner.nextLine();

        // 1. Girişin palindrom olup olmadığını kontrol etme
        boolean palindromMu = palindromKontrolu(giris);

        if (palindromMu) {
            System.out.println("Girilen ifade bir palindromdur.");
        } else {
            // 2. Palindrom değilse kuralı bozan ilk karakteri bulma
            char ilkUyumsuzKarakter = ilkUyumsuzKarakteriBul(giris);
            System.out.println("Palindrom kuralını bozan ilk karakter: " + ilkUyumsuzKarakter);

            // 3. Girilen ifadenin nasıl bir palindroma dönüştürülebileceğini gösterme
            String duzeltilmisPalindrom = palindromDuzelt(giris);
            System.out.println("Palindrom yapmak için yazılması gereken hali: " + duzeltilmisPalindrom);
        }

        scanner.close();
    }

    // Metot: Girişin palindrom olup olmadığını kontrol etme
    private static boolean palindromKontrolu(String str) {
        String temizlenmisStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int sol = 0;
        int sag = temizlenmisStr.length() - 1;

        while (sol < sag) {
            if (temizlenmisStr.charAt(sol) != temizlenmisStr.charAt(sag)) {
                return false;
            }
            sol++;
            sag--;
        }
        return true;
    }

    // Metot: Palindrom olmayan ilk karakteri bulma
    private static char ilkUyumsuzKarakteriBul(String str) {
        String temizlenmisStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int sol = 0;
        int sag = temizlenmisStr.length() - 1;

        while (sol < sag) {
            if (temizlenmisStr.charAt(sol) != temizlenmisStr.charAt(sag)) {
                return temizlenmisStr.charAt(sol);
            }
            sol++;
            sag--;
        }
        return '\0'; // Eğer uyumsuz karakter bulunamazsa null karakter döndürülür (bu durum bu programda oluşmamalı)
    }

    // Metot: Girilen ifadeyi nasıl bir palindroma dönüştürebileceğini gösterme
    private static String palindromDuzelt(String str) {
        String temizlenmisStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String tersCevrilmis = new StringBuilder(temizlenmisStr).reverse().toString();
        return tersCevrilmis;
    }
}


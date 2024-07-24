package Oyunlar;

import java.util.Scanner;

public class AdamAsmacaOyunu {
    /*
    Bu programda, kelimeler adlı bir kelime listesi oluşturulacak.
    Ardından, bu listeden rastgele bir kelime seçmek için Math.random() fonksiyonu kullanılmıştır.
    Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
    kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
    Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
    Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kelimeler = {"java", "programlama", "bilgisayar", "yazılım", "değişken", "fonksiyon"};
        String secilenKelime = kelimeler[(int) (Math.random() * kelimeler.length)];
        int kelimelength=secilenKelime.length();
        System.out.println("Kelimemiz "+(kelimelength+1)+ " harflidir");
        System.out.println("Lütfen her bir harften sonra ENTER tuşuna basınız!");

        int canSayisi = 5;
        String[] tahminEdilenHarfler = new String[secilenKelime.length()];
        for (int i = 0; i < tahminEdilenHarfler.length; i++) {
            tahminEdilenHarfler[i] = "_";
        }

        while (canSayisi > 0) {
            System.out.println("Kalan can: " + canSayisi);
            System.out.print("Tahmin ettiğiniz harfi girin: ");
            String tahmin = scanner.next();

            boolean dogruTahmin = false;
            for (int i = 0; i < secilenKelime.length(); i++) {
                if (secilenKelime.charAt(i) == tahmin.charAt(0)) {
                    tahminEdilenHarfler[i] = tahmin;
                    dogruTahmin = true;
                }
            }

            if (!dogruTahmin) {
                canSayisi--;
            }

            System.out.println("Tahmin edilen kelime: ");
            for (int i = 0; i < tahminEdilenHarfler.length; i++) {
                System.out.print(tahminEdilenHarfler[i] + " ");
            }
            System.out.println();

            if (!String.join("", tahminEdilenHarfler).contains("_")) {
                System.out.println("Tebrikler, kazandınız!");
                break;
            }
        }

        if (canSayisi == 0) {
            System.out.println("Kaybettiniz. Doğru kelime: " + secilenKelime);
        }

        scanner.close();
    }
}


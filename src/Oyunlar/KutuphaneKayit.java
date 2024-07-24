package Oyunlar;

import java.util.ArrayList;
import java.util.Scanner;

public class KutuphaneKayit {

    // Kitap sınıfı
    static class Kitap {
        String ad;
        String yazar;
        int yayinYili;
        String yayinEvi;

        // Kitap nesnesinin yapıcı metodu
        public Kitap(String ad, String yazar, int yayinYili, String yayinEvi) {
            this.ad = ad;
            this.yazar = yazar;
            this.yayinYili = yayinYili;
            this.yayinEvi = yayinEvi;
        }

        // Kitap nesnesinin özelliklerini yazdıran metot
        public void yazdir() {
            System.out.println("Kitap Adı: " + ad);
            System.out.println("Yazarı: " + yazar);
            System.out.println("Yayın Yılı: " + yayinYili);
            System.out.println("Yayın Evi: " + yayinEvi);
        }
    }

    public static void main(String[] args) {
        ArrayList<Kitap> kutuphane = new ArrayList<Kitap>(); // Kitapların kaydedileceği koleksiyon
        Scanner scanner = new Scanner(System.in);

        // Menüyü yazdır
        System.out.println("Kütüphane Kayıt Sistemi");
        System.out.println("-----------------------");
        System.out.println("1. Kitap Ekle");
        System.out.println("2. Kitapları Listele");
        System.out.println("3. Çıkış");

        int secim = 0;
        while (secim != 3) {
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Kitap Adı: ");
                    String ad = scanner.next();
                    System.out.print("Yazarı: ");
                    String yazar = scanner.next();
                    System.out.print("Yayın Yılı: ");
                    int yayinYili = scanner.nextInt();
                    System.out.print("Yayın Evi: ");
                    String yayinEvi = scanner.next();

                    // Kitap nesnesini oluştur ve kütüphaneye ekle
                    Kitap kitap = new Kitap(ad, yazar, yayinYili, yayinEvi);
                    kutuphane.add(kitap);
                    System.out.println("Kitap başarıyla eklendi.");
                    break;

                case 2:
                    // Kütüphanedeki tüm kitapları listele
                    System.out.println("Kütüphanedeki Kitaplar");
                    System.out.println("-----------------------");
                    for (Kitap k : kutuphane) {
                        k.yazdir();
                        System.out.println("-----------------------");
                    }
                    break;

                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Hatalı seçim yaptınız, lütfen tekrar deneyin.");
                    break;
            }
        }

        scanner.close();
    }
}
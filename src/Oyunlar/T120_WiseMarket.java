package Oyunlar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T120_WiseMarket {
    /*
     Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
     alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince giş yazdıran bir program
     hazırlayın
      ==================== WISE MARKET KASA PROGRAMI ===================================
    ilk programa girildiginde bizi bir menu karsilasin bu secenekler
      1 ŞARKÜTERİ ÜRÜNLERİ
      2 MANAV ÜRÜNLERİ
      3 MARKET ÜRÜNLERİ
      secime gore ,
      4-urunleri listele ve
      5-fiyatlari gelsin
      Variable'ları belirleyelim
      urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam
    */
    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;  //double: ondalıklı sayı için kullanılır
    static double urunMiktari;
    static int urunKodu;     //int : tam sayı değerleri için kullanılır.
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;

    public static void main(String[] args) {
        girisEkrani();
        {
        }
    }

    public static void girisEkrani() {
        System.out.println("================= T120 - WISE MARKET =================");
        System.out.println("=================    Hoşgeldiniz     =================");
        System.out.println("-----------------       Menü         -----------------");
        System.out.println("   Lütfen Alışveriş Yapmak İstediğiniz Reyonu Seçiniz  ");
        System.out.println("1 - Şarküteri \n2 - Manav\n3 - Market\n4 - Fiş Yazdır\n5 - Çıkış");

        int secim = scan.nextInt();
        if ((secim < 1 || secim > 5)) { //if(!(secim>=1 && secim<=5))
            System.out.println(" Uyarı: Geçersiz bir tuşa bastınız. Tekrar Giriniz ");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }

    }

    public static void sarkuteri() {
        System.out.println("Şarkteri Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürün numarasını giriniz.\n61-Kaşar Peyniri 130₺\n62-Zeytin 120₺\n63-Sucuk 200₺\n64-Kıyma 350₺ ");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 61 && urunKodu <= 64) {
                System.out.println("Kaç kg alacaksınız?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 61:
                        urunAdi = "Kaşar Peyniri";
                        urunFiyati = 130;
                        break;
                    case 62:
                        urunAdi = "Zeytin";
                        urunFiyati = 120;
                        break;
                    case 63:
                        urunAdi = "Sucuk";
                        urunFiyati = 200;
                        break;
                    case 64:
                        urunAdi = "Kıyma";
                        urunFiyati = 350;

                        break;
                }
                System.out.println(urunMiktari + " kg " + urunAdi + ":" + (urunFiyati * urunMiktari) + " ₺");
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam);
                sepet += urunAdi + " :" + urunFiyati + "₺\n";
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin.\n Ana Menüye dönmek için 0 tuşuna basınız.");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }
    public static void manav() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen alacağınız ürün kodunu giriniz:\n71-Muz - 60₺\n72-Patates - 25₺\n73-Elma - 49₺\n74-Soğan - 20₺\n75-Domates - 39₺\n76-Ananas - 59₺ ");
        while(!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=71&&urunKodu<=76){
                System.out.println("Kaç kg alacaksınız?");
                urunMiktari= scan.nextInt();
                switch (urunKodu){
                    case 71:
                        urunAdi="Muz";
                        urunFiyati=60;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 72:
                        urunAdi="Patates";
                        urunFiyati=25;
                        System.out.println((urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir"));
                        break;
                    case 73:
                        urunAdi="Elma";
                        urunFiyati=49;
                        System.out.println((urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir"));
                        break;
                    case 74:
                        urunAdi="Soğan";
                        urunFiyati=20;
                        System.out.println((urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir"));
                        break;
                    case 75:
                        urunAdi="Domates";
                        urunFiyati=39;
                        System.out.println((urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir"));
                        break;
                    case 76:
                        urunAdi="Ananas";
                        urunFiyati=59;
                        System.out.println((urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir"));
                        break;
                }
                urunFiyati=urunFiyati*urunMiktari;
                toplam+=urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: "+toplam);
                sepet+=urunAdi+" : "+urunFiyati+" Tl \n";
                System.out.println("Başka ürün almak isterseniz kodunu giriniz. Ana menüye dönmek için 0 tuşuna basınız.");
            } else if (urunKodu==0) {

                girisEkrani();

            }


        }

    }

    public static void market() {
        System.out.println("Market Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen satın almak istediğiniz Ürün Kodunu giriniz:\n81-Nutella - 103₺\n82-Ekmek - 8₺\n83-Yumurta - 76₺\n84-Yoğurt - 29₺ ");
        while(!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=81&&urunKodu<=84){
                System.out.println("Kaç kg/adet alacaksınız?");
                urunMiktari= scan.nextInt();
                switch (urunKodu){
                    case 81:
                        urunAdi="Nutella";
                        urunFiyati=103;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 82:
                        urunAdi="Ekmek";
                        urunFiyati=8;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 83:
                        urunAdi="Yumurta";
                        urunFiyati=76;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                    case 84:
                        urunAdi="Yoğurt";
                        urunFiyati=29;
                        System.out.println(urunMiktari+" kg "+urunAdi+" fiyatı: "+urunFiyati*urunMiktari+" TL'dir");
                        break;
                }
                urunFiyati=urunMiktari*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: "+toplam);
                sepet+=urunAdi+" : "+urunFiyati+" TL ";
                System.out.println("Başka ürün almak isterseniz kodunu giriniz. Ana menüye dönmek için 0 tuşuna basınız.");
            } else if (urunKodu==0) {
                girisEkrani();
            }
        }

    }

    public static void fisYazdir() {
        /*
        ÖDEV: Müşteriden ödediği miktarı alıp sisteme giren ve verdiği para yeterli ise para üstünü yazdıran,
        yeterli değilse verdiğiniz miktar yeterli değildir diye uyarak kodu ekleyiniz
         */
        System.out.println("================= T120 - WISE MARKET =================");
        System.out.println("=====    Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz     ======");
        System.out.println("----------      Alışveriş Bilgileriniz         -------------");
        System.out.println(" \n \n");
        System.out.println("Alışveriş Listeniz\n"+sepet);
        System.out.println(" ");
        System.out.println("Toplam Tutar: "+toplam);
        System.out.println(" \n \n");
        System.out.println("------------      İyi Günler Dileriz         --------------");
        LocalDateTime currentTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");
        String newfFormatDateTime= currentTime.format(formatter);
        System.out.println("Yeni Zaman Biçimi: "+ newfFormatDateTime);
        System.out.println("ana menüye dönmek için 0 tuşuna basınız. Çıkış yapmak için 5 tuşuna basınız");
        if (urunKodu==0){
            girisEkrani();
        } else if (urunKodu==5) {
            cikis();
        }
        //cikis();
    }

    public static void cikis() {
       // scan.close();
        System.exit(0); // Çalışan Java kodunu durdurur.

    }


}


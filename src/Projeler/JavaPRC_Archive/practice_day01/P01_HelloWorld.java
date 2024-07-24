package Projeler.JavaPRC_Archive.practice_day01;

public class P01_HelloWorld {
    public static void main(String[] args) {

        //System.out.println("Merhaba Java");
        //System.out.println("Hello World"); //println fonksiyonu verilen string ifadeyi yazdırıp bir alt satıra geçer
        //System.out.print("yazdırma fonksiyonu-"); //print fonksiyonu verilen string ifadeyi yazdırır ve alt satıra geçmez
        //System.out.println("merhaba");


        // Bu işaret tek satırlık yorum için kullanılır


       /*
       Birde fazla satırlık yorum yazmak gerekirse
       bu şekilde kullanım yapılmalıdır
        */

        // Soru -1 : Konsola  "Hello Java Ben Geldim"  yazdırınız.
        System.out.println("Hello Java Ben Geldim");
        System.out.println("\"Hello Java Ben Geldim\"");

        /*
        \"      : Çift tırnak işareti yazdırır
        \'      : Tek tırnak işareti yazdırır
        \n or \r: Kendinden sonra gelen metni bir alt satırdan başlatır.
        \t      : Kendinden sonra bir TAB boşluk bırakır
         */

       System.out.println("\'Hello Wise\'");
       System.out.println();
       System.out.println("Hello Wise\nHave a nice day!");
       System.out.println("Hello Java\nSen neymişsin be abi!");
       System.out.println();
       System.out.println("Hello Wise\t\t\t\t\tHello Future");

      /*
      Soru - 2 : Konsola
      Değer atayarak
      Ramazan TANHAN - Software Development Engineer in TEST
       */

     /*
     Javada variable dediğimiz değişkenlerler kullanılır.
     Primitive - Non Primitive
      */

        String name = "Ömer";
        String surname = "YİĞİT";
        String job = "Software Development Engineer in TEST";
        System.out.println(name+" "+surname+" " +"- "+job);

        /*
        ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        **********  WISE BANK   **********
            WISE ATM'YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        **********  WISE BANK   **********
         */
        //SDLC - Software Development Life Cycle ( Yazılım Geliştirme Yaşam Döngüsü)
        //STLC - Software Test Life Cycle ( Yazılım Test Yaşam Döngüsü)

        // Ekranda bir bölümün fotosunu almak
        // Windows: Win+shift+S  (Windows 10: Ekran Alıntısı Aracı)
        // Mac    : Cmd+Shift+4

    }
}


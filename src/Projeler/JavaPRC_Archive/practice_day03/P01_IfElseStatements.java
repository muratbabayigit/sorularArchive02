package Projeler.JavaPRC_Archive.practice_day03;

import java.util.Scanner;

public class P01_IfElseStatements {
    /*
      Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
      sorun, istedigi birim metre, desimetre veya santimetre ise cevirip yazdirin, yoksa
      "istediginiz birim sisteme kayitli degil" yazdirin.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      System.out.print("Lütfen mesafeyi kilometre cinsinden yazınız: ");
      double km = scan.nextDouble();
      System.out.print("Dönüştürmek istediğiniz birim cinsini yazınız: ");
      char birim = scan.next().charAt(0);

      if (birim == 'm' || birim == 'M') {
          System.out.println("Km olarak yazdığınız değerin karşılığı: " + km * 1000 + " m'dir");
      } else if (birim == 's' || birim == 'S' || birim == 'C' || birim == 'c') {
          System.out.println("Km olarak yazdığınız değerin karşılığı " + km * 100000 + " cm'dir");
      } else if (birim == 'd' || birim == 'D') {
          System.out.println("Km olarak yazdığınız değerin karşılığı " + km * 10000 + " dm'dir");

      } else {
          System.out.println("Girdiğiniz birim sistemimizde bulunmamaktadır.");
      }
        /*
        Not: Birden fazla if,elseif,else durumlarında en son adıma bakılır.
        else ile ile bitiyorda if else bloğu tüm ihtimalleri kapsamalıdır.
        else ile bitiyorsa kapsanmayan ihtimaller de vardır.
         */

        /*
    Öğrenci notunu harf notuna dönüştüren bir kod yazınız
    85-100 -----> AA
    80-85 ------> BA
    75-80 ------> BB
    65-75 ------> CB
    50-65 ------> CC
    50 Altı ise  ------> FF
     */

       System.out.print("Lütfen sayısal olarak notunuzu giriniz: ");
       double not = scan.nextDouble();
       if (not>100){
           System.out.println("Notunuz 100'den fazla olamaz. BU nedenle hafr karşılığı yoktur");
       }else if (not >= 85.0 && not <= 100.0) {
           System.out.println("Girdiğiniz " + not + "'un harf karşılığı AA'dır");
       } else if (not >= 80.0 && not < 85.0) {
           System.out.println("Girdiğiniz " + not + "'un harf karşılığı BA'dır");
       } else if (not >= 75 && not < 80) {
           System.out.println("Girdiğiniz " + not + "'un harf karşılığı BB'dir");
       } else if (not >= 65 && not < 75) {
           System.out.println("Girdiğiniz " + not + "'un harf karşılığı CB'dir");
       } else if (not >= 50 && not < 65) {
           System.out.println("Girdiğiniz " + not + "'un harf karşılığı CC'dir");
       } else {
           System.out.println("Girdiğiniz " + not + "'un harf karşılığı FF'dir");

       }
    }

}
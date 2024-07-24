package Projeler.JavaPRC_Archive.practice_day06;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
      /*
    Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
    Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
    bilince de tebrik edip durduran bir kod yazalim
     */
      public static void main(String[] args) {

          //int sayi=138;
          Random random=new Random();
          int sayi= random.nextInt(150); //0-150 arası bir sayı üret
          System.out.println("Aklımdan bir sayı tuttum. Hadi Tahmin Et!");
          Scanner scanner=new Scanner(System.in);
          boolean dogruMu=false;
          while (!dogruMu){
              int tahmin= scanner.nextInt();
              if (tahmin>sayi){
                  System.out.println("Çok söyledin. Düşür");
              } else if (tahmin<sayi) {
                  System.out.println("Az söyledin. Arttır");
              } else if (tahmin==sayi) {
                  System.out.println("Tebrikler Bildiniz");
                  dogruMu=true;
              }else{
                  dogruMu=false;
              }
          }
      }
}

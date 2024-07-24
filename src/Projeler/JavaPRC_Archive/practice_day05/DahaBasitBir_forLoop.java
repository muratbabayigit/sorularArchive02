package Projeler.JavaPRC_Archive.practice_day05;

import java.util.Scanner;

public class DahaBasitBir_forLoop {

      /*
         Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
        yazdirin
     */
      public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
          System.out.print("Lütfen 150'den küçük pozitif bir sayı giriniz: ");
          int sayi= scan.nextInt();
          //1 2 WISE4 QUARTERWISE7 8 WISEQUARTER11 WISE13 14 WISE16 17 WISE19 QUARTERWISE22 23 WISEQUARTER26 WISE28 29 WISE
          //1 2 WSIE4 QUARTERWSIE7 8 WSIEQUARTER11 WSIE13 14 WISE QUARTER16 17 WSIE19 QUARTERWSIE22 23 WSIEQUARTER26 WSIE28 29 WISE QUARTER
          for (int i = 1; i <=sayi ; i++) {
              if(i%3==0&&i%5==0){
                  System.out.print("WISE QUARTER ");
              } else if (i%5==0) {
                  System.out.print("QUARTER ");
              } else if (i%3==0) {
                  System.out.print("WSIE ");
              }else{
                  System.out.print(i+" ");
              }

          }


      }
}

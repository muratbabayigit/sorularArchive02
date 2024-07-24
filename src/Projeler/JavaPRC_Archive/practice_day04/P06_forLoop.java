package Projeler.JavaPRC_Archive.practice_day04;

import java.util.Scanner;

public class P06_forLoop {

    /*
    Kulanıcıdan sıfırdan farklı pozitif bir tam sayı alalım ve 1'den o sayıya kadar olan sayılardan 4 ile bölünebilenleri yazıdırın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Pozitif bir tamsayı giriniz");
        int girilenSayi = scan.nextInt();
        if (girilenSayi <= 0) {
            System.out.print("Yanlış giriş yaptınız. Lütfen Pozitif bir tamsayı giriniz");
        } else {
            for (int i = 1; i <= girilenSayi; i++) {

                if (i % 4 == 0) {

                    System.out.print(i + "-");
                }

            }
        }

    }
}

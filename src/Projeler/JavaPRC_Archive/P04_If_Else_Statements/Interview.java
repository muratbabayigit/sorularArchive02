package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol edilecek yıl giriniz: ");
        int yil= scan.nextInt();
        if (yil%4==0){
            if (yil%100==0){
                if (yil%400==0){
                    System.out.println("Girdiğiniz yıl ARTIK YIL'dır");
                }else System.out.println("Girdiğiniz yıl artık yıl değildir.");
            }
        }
    }
}

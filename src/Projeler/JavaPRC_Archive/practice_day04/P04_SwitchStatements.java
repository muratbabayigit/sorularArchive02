package Projeler.JavaPRC_Archive.practice_day04;

import java.util.Scanner;

public class P04_SwitchStatements {
    //Kullanıcıdan doğduğu ayın numarasını girmesini isteyip.
    //Hangi ay doğduğunu yazdıran kod dizesiniz yazınıd
    public static void main(String[] args) {
        System.out.print ("Lütfen doğum tarihinizin ay hanesindeki sayıyı yazınız: ");
        Scanner scan=new Scanner(System.in);
        int month= scan.nextInt();

        switch(month){
            case 1:
                System.out.println("Ocak ayında doğmuşsunuz");
                break;
            case 2:
                System.out.println("Şubat ayında doğmuşsunuz");
                break;
            case 3:
                System.out.println("Mart ayında doğmuşsunuz");
                break;
            case 4:
                System.out.println("Nisan ayında doğmuşsunuz");
                break;
            case 5:
                System.out.println("Mayıs ayında doğmuşsunuz");
                break;
            case 6:
                System.out.println("Haziran ayında doğmuşsunuz");
                break;
            case 7:
                System.out.println("Temmuz ayında doğmuşsunuz");
                break;
            case 8:
                System.out.println("Ağustos ayında doğmuşsunuz");
                break;
            case 9:
                System.out.println("Eylül ayında doğmuşsunuz");
                break;
            case 10:
                System.out.println("Ekim ayında doğmuşsunuz");
                break;
            case 11:
                System.out.println("Kasım ayında doğmuşsunuz");
                break;
            case 12:
                System.out.println("Aralık ayında doğmuşsunuz");
                break;
            default:
                System.out.println(month +" olarak girdiğiniz sayıda bir ay numarası yoktur. Yanlış giriş yaptınız");


        }
    }


}

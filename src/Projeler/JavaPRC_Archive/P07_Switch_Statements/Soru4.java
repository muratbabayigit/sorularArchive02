package Projeler.JavaPRC_Archive.P07_Switch_Statements;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ISTQB kısaltmasından öğrenmek istediğiniz harfi giriniz:");
        char chr=scan.next().charAt(0);

        switch (chr){
            case 'I':
            case 'i':
                System.out.println("International");break;
            case 'S':
            case 's':
                System.out.println("Software");break;
            case 'T':
            case 't':
                System.out.println("Testing");break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");break;
            case 'B':
            case 'b':
                System.out.println("Board");break;
            default:
                System.out.println("Yanlış giriş yaptınız");
        }
    }
}

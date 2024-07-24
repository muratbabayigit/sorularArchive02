package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru2_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı ve cinsiyetinizi giriniz E/K ");
        int yas= scan.nextInt();
        char cinsiyet=scan.next().charAt(0);
        if ((cinsiyet=='K'||cinsiyet=='k') && yas>=60){
            System.out.println("Emekli olabilirsin");
        }
        if ((cinsiyet=='K'||cinsiyet=='k') && yas<60){
            System.out.println("Emekli olmak için "+(60-yas)+" yıl çalışman gerekir");
        }
        if ((cinsiyet=='E'||cinsiyet=='e')&& yas>=65){
            System.out.println("Emekli olabilirsin");
        }
        if ((cinsiyet=='E'||cinsiyet=='e')&& yas<65){
            System.out.println("Emekli olmak için "+(65-yas)+" yıl çalışman gerekir");
    }
}
}


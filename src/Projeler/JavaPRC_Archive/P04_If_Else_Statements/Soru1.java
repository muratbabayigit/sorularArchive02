package Projeler.JavaPRC_Archive.P04_If_Else_Statements;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfenin üçgenin kenar uzunluklarını giriniz:");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }else System.out.println("Eskenar degil");
    }
}

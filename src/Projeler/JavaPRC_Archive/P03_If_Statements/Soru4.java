package Projeler.JavaPRC_Archive.P03_If_Statements;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfenin üçgenin kenar uzunluklarını giriniz:");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen");
        }
    }
}

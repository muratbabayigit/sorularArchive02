package Projeler.JavaPRC_Archive.P06_Ternary_Operator;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunuklarını giriniz:");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        System.out.println((kenar1==kenar2 && kenar2==kenar3) ? "Eşkenar üçgen" : "Eşkenar değil");
    }
}

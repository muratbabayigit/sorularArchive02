package Projeler.JavaPRC_Archive.P01_Variables_and_Scanner;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen değerleri hesaplanacak çemberin yarıçapını giriniz: ");
        double yaricap=scan.nextDouble();
        System.out.println("Girdiğiniz çemberin çevresi: "+(2*3.1415*yaricap)+
                " alani: "+(3.1415*yaricap*yaricap));
    }
}

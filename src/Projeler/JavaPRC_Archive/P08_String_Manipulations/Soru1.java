package Projeler.JavaPRC_Archive.P08_String_Manipulations;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz:");
        String str=scan.nextLine();
        String strKucuk=str.toLowerCase();

        if (strKucuk.contains("ev")){
            System.out.println("home home sweet home");
        }
        else if (strKucuk.contains("is")){
            System.out.println("calismak guzeldir");
        }
        else if (strKucuk.contains("ev")&&str.contains("is")){
            System.out.println("hem ev lazim hem is");
        }
        else System.out.println("cok calisman lazim");
    }
}

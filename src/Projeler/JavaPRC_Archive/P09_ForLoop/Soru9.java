package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String str= scan.nextLine();
        String tersStr="";

        for (int i = str.length(); i >=1; i--) {
            tersStr+=str.substring(i-1,i);
        }
        System.out.println(tersStr);
    }
}

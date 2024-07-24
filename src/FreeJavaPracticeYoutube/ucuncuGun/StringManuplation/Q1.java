package FreeJavaPracticeYoutube.ucuncuGun.StringManuplation;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir yazı girişi yapınız");
        String text=scan.nextLine();

        System.out.println(text.contains(" "));
        System.out.println(text.isEmpty());
        System.out.println(text.isBlank());
    }
}

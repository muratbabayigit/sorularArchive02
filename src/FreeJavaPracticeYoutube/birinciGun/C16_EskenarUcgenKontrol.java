package FreeJavaPracticeYoutube.birinciGun;

import java.util.Scanner;

public class C16_EskenarUcgenKontrol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgen kenarlarını giriniz:");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        if (a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c){
            if (a==b && b==c){
                System.out.println("Bu üçgen eşkenar üçgendir");
            }else System.out.println("Bu üçgen eşkenar üçgen değildir");
        }else System.out.println("Bu bir üçgen değildir");
    }
}

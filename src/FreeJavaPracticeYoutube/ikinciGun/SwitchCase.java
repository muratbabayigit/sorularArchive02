package FreeJavaPracticeYoutube.ikinciGun;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not= scan.nextInt();
        String harfNot="";

        if (not>=0&& not<50) {
            System.out.println("D");
            harfNot="D";
        }
        else if (not>=50&&not<60) {
            System.out.println("C");
            harfNot="C";
        } else if (not>=60&&not<80) {
            System.out.println("B");
            harfNot="B";
        } else if (not>=80) {
            System.out.println("A");
            harfNot="A";
        }else System.out.println("Geçersiz Not");

        switch (harfNot){
            case "A":
                System.out.println("Woavv");break;
            case "B":
                System.out.println("Fena Değil");break;
            case "C":
                System.out.println("Eh işte");break;
            case "D":
                System.out.println("Ucu ucuna!");break;
            default:
                System.out.println("Yanlış giriniz");
        }
    }
}

package Projeler.JavaPRC_Archive.P09_ForLoop;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz: ");
        int girilenSayi= scan.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print((" fizzBuzz "));
            }
            else if (i%5==0){
                System.out.print((" buzz "));
            }
            else if (i%3==0) {
                System.out.print(" fizz ");;

            }else{
            System.out.print(i+" ");
            }
        }
    }
}

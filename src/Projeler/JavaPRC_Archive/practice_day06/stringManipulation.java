package Projeler.JavaPRC_Archive.practice_day06;

import java.util.Scanner;

public class stringManipulation {
    /*
Kullanicidan bir cumle alin
    - cumlede ev geciyorsa, "home home sweet home" yazdirin
    - cumlede is geciyorsa, "calismak guzeldir"
    - ikisini de iceriyorsa "Hem ev lazim hem is"
    - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle= scan.nextLine();
        String kucukcumle=cumle.toLowerCase();

        if (kucukcumle.contains("ev")&&kucukcumle.contains("is")){
            System.out.println("Hem Ev Hem İş Lazım");
        } else if (kucukcumle.contains("ev")) {
            System.out.println(" home home sweet home");
        } else if (kucukcumle.contains("iş")) {
            System.out.println("çalışmak güzeldir");
        }else{
            System.out.println("Çok çalışman Lazım");
        }

    }
}

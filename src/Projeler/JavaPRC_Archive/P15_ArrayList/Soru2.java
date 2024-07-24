package Projeler.JavaPRC_Archive.P15_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        System.out.println(isimListesiDondur());
    }

    private static List<String> isimListesiDondur() {
        Scanner scan=new Scanner(System.in);
        String isim="";
        List<String> isimler=new ArrayList<>();
        do {
            System.out.println("Eklemek için isim giriniz, çıkmak için Q'ya basınız, gıcıklık yapmayınız");
            isim=scan.nextLine();
           if (isim.charAt(0)!='Q'&&isim.charAt(0)!='q'){
                isimler.add(isim);}
        }while (isim.charAt(0)!='Q'&& isim.charAt(0)!='q');

        return isimler;
    }
}

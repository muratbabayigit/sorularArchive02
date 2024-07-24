package Projeler.JavaPRC_Archive.P13_Arrays;

import java.util.Arrays;

public class Soru6 { //ÇALIŞMIYOR İYİCE İNCELE EKSİKLİKLERİ GİDER

    public static void main(String[] args) {
        String[] str={"Now playing avamax sweet by psycho"};
        enUzunVeKisaKelimeleriBul(str);
    }

    private static void enUzunVeKisaKelimeleriBul(String[] str) {
        String cumle="";
        String enKisa=str[0];
        String enUzun="";

        for (String each:str) {
            cumle+=each+" ";
        }
        cumle= Arrays.toString(cumle.split(" "));

        for (String s : str) {
            if (s.length() > enUzun.length()) {
                enUzun = s;
            }
            if (s.length() < enKisa.length()) {
                enKisa= s;
            }
        }
        System.out.println("enUzun = " + enUzun);
        System.out.println("enKisa = " + enKisa);

    }
}

package Projeler.JavaPRC_Archive.practice_day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class soru30 {
    public static void main(String[] args) {
        System.out.println("Lütfen yinelenen karakterlerini bulmak istediğiniz bir kelime giriniz: ");
        Scanner scanner = new Scanner(System.in);
        String abc = scanner.next();

        ArrayList<Character> ayniKarakterList = new ArrayList<>();

        for (int i = 0; i < abc.length(); i++) {
            char fakliChar = abc.charAt(i);
            boolean isRepeated = false;

            for (int j = i + 1; j < abc.length(); j++) {
                if (fakliChar == abc.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (isRepeated && !ayniKarakterList.contains(fakliChar)) {
                ayniKarakterList.add(fakliChar);
            }
        }

        String[] kelime = new String[ayniKarakterList.size()];
        for (int i = 0; i < ayniKarakterList.size(); i++) {
            kelime[i] = String.valueOf(ayniKarakterList.get(i));
        }

        System.out.println("Yinelenen karakterler: " + Arrays.toString(kelime));
    }
}

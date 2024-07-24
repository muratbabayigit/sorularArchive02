package Oyunlar;

import java.util.ArrayList;
import java.util.Scanner;

public class IzledigimFilmlervePuanlarim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> filmIsimleri = new ArrayList<String>();
        ArrayList<Integer> filmPuanlari = new ArrayList<Integer>();

        while (true) {
            System.out.print("Film ismi (çıkmak için q): ");
            String filmIsmi = scanner.nextLine();
            if (filmIsmi.equals("q")) {
                break;
            }

            System.out.print("Puan (1-10 arası): ");
            int puan = scanner.nextInt();
            scanner.nextLine();

            filmIsimleri.add(filmIsmi);
            filmPuanlari.add(puan);
        }

        System.out.println("İzlediğiniz filmler:");
        for (int i = 0; i < filmIsimleri.size(); i++) {
            System.out.println(filmIsimleri.get(i) + " - " + filmPuanlari.get(i));
        }
    }
}

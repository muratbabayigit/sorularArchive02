package Projeler.JavaPRC_Archive.P14_MultiDimensionalArray.MultiDimension_001;

import java.util.Scanner;

public class Multidimesion {
    public static void main(String[] args) {


// 4x2'lik bir multidimension array oluşturun ve içine çeşitli şehir ve nüfus bilgileri ekleyin.
// Daha sonra kullanıcıdan bir şehir adı alarak, bu şehrin nüfusunu ekrana yazdırın.

// Örnek çıktı:
// Şehir adı: İstanbul
// Nüfus: 15029231
String[][] cityData = {
        {"İstanbul", "15029231"},
        {"Ankara", "5618273"},
        {"İzmir", "4325178"},
        {"Bursa", "3030534"}
};

    Scanner scanner = new Scanner(System.in);
        System.out.print("Şehir adı: ");
    String searchedCity = scanner.nextLine();

    String population = null;
        for (int i = 0; i < cityData.length; i++) {
        if (cityData[i][0].equalsIgnoreCase(searchedCity)) {
            population = cityData[i][1];
            break;
        }
    }

        if (population != null) {
        System.out.println("Nüfus: " + population);
    } else {
        System.out.println("Şehir bulunamadı.");
    }
}
}
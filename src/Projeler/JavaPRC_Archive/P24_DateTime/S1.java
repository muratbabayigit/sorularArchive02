package Projeler.JavaPRC_Archive.P24_DateTime;

import java.time.LocalDateTime;

public class S1 {
    // Soru: Java'da tarih ve saat bilgisini temsil etmek için hangi sınıflar kullanılır? Verilen
// bir örnekle tarih ve saat bilgisini nasıl elde edebileceğinizi gösteriniz.




        public static void main(String[] args) {
            LocalDateTime currentDateTime = LocalDateTime.now(); // Şu anki tarih ve saat bilgisi alınıyor.
            System.out.println("Şu Anki Tarih ve Saat: " + currentDateTime);
        }
    }


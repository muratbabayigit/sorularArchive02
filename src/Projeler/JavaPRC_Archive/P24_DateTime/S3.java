package Projeler.JavaPRC_Archive.P24_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class S3 {
    // Soru: Java'da tarih ve saat bilgisini belirli bir formatta nasıl biçimlendirirsiniz?
// Verilen bir örnekle tarih ve saati farklı biçimlerde nasıl gösterebileceğinizi açıklayınız.


        public static void main(String[] args) {
            LocalDateTime currentDateTime = LocalDateTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter); // Belirtilen formata göre biçimlendiriliyor.
            System.out.println("Biçimlendirilmiş Tarih ve Saat: " + formattedDateTime);
        }
    }



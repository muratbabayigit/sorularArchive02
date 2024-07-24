package Projeler.JavaPRC_Archive.practice_day08;
// Soru: Java'da tarih ve saat bilgisini belirli bir formatta nasıl biçimlendirirsiniz?
// Verilen bir örnekle tarih ve saati farklı biçimlerde nasıl gösterebileceğinizi açıklayınız.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime currentTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");
        String newfFormatDateTime= currentTime.format(formatter);
        System.out.println("Yeni Zaman Biçimi: "+ newfFormatDateTime);

    }
}

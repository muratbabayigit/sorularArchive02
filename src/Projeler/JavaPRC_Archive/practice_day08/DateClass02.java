package Projeler.JavaPRC_Archive.practice_day08;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Soru: Verilen bir tarihten belirli gün sayısını ekleyerek gelecekteki bir tarihi hesaplayan bir kod dizgisi yazınız

// LocalDateTime:  Yıl Gün Ay Saat:Dakika:Sn içerir
// Local Date: Yıl Gün ay
public class DateClass02 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(1980,5,07);//Başlangıç tarihibi belirledik
        LocalDate futureDate = calculateFuturDate(startDate, 120); //120 gün sonrasını hesaplayacak
        System.out.println("120 Gün Sonrası: "+futureDate);
    }

    static LocalDate calculateFuturDate(LocalDate startDate, long addDay) {

    return startDate.plus(addDay, ChronoUnit.DAYS);
    }


}

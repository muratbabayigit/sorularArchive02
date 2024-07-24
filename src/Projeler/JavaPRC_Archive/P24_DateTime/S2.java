package Projeler.JavaPRC_Archive.P24_DateTime;
// Soru: Verilen bir tarihten belirli gün sayısını ekleyerek gelecekteki bir tarihi hesaplayan bir
// fonksiyon nasıl yazılır? Bir örnek yaparak gösteriniz.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class S2 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 8, 1); // Başlangıç tarihi belirleniyor.
        LocalDate futureDate = calculateFutureDate(startDate, 10); // 10 gün sonrasını hesaplıyoruz.
        System.out.println("10 Gün Sonrası: " + futureDate);
    }

    static LocalDate calculateFutureDate(LocalDate startDate, long daysToAdd) {
        return startDate.plus(daysToAdd, ChronoUnit.DAYS); // Günleri ekleyerek gelecekteki tarihi elde ediyoruz.
    }


}

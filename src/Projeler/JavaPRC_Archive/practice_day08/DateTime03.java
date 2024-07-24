package Projeler.JavaPRC_Archive.practice_day08;

import java.time.Duration;
import java.time.LocalDateTime;

// Belirli bir tarih girip o günden bugüne geçen zamanı gün saat dakika saniye olarak yazdırın
public class DateTime03 {
    public static void main(String[] args) {
        LocalDateTime startDate=LocalDateTime.of(2005,7,31,20,00);
        LocalDateTime currentDate=LocalDateTime.now();

        Duration duration=Duration.between(startDate,currentDate);

        long day= duration.toDays();
        long hour= duration.toHoursPart();
        long minutes= duration.toMinutesPart();
        long seconds= duration.toSecondsPart();

        System.out.println("Evliliğimizde bugün: "+day+".gün "+hour+".saat "+minutes+".dakika "+seconds+".saniye geride kaldı");
    }

}

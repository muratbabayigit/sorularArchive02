package Projeler.JavaPRC_Archive.P19_ImmutableClasses.ImmutableClass_06;

public class S1 {
    // Soru: Immutable bir sınıf nasıl oluşturulur? Bir sınıfın değişmez (immutable) olması için
// nasıl adımlar atılır?

    public final class ImmutableExample {
        private final String message; // Final anahtar kelimesi ile değişmez özellik tanımlanıyor.

        public ImmutableExample(String message) {
            this.message = message; // Yapıcı metot ile değer atanıyor.
        }

        public String getMessage() {
            return message; // Getter metodu ile değer erişimi sağlanıyor.
        }
    }

}

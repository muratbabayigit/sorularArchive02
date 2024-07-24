package Projeler.JavaPRC_Archive.P19_ImmutableClasses.ImmutableClass_06;

public class S3 {
    // Soru: Immutable sınıfların dezavantajları nelerdir? Hangi durumlarda tercih edilmeyebilirler?
// Immutable sınıfların her değişiklikte yeni bir nesne yaratma maliyeti nedeniyle bazı durumlarda
// performans sorunlarına yol açabileceğini açıklayan bir örnek yapınız.


        public static void main(String[] args) {
            String originalString = "Bu bir örnek metin.";
            ImmutableStringWrapper wrapper = new ImmutableStringWrapper(originalString);

            System.out.println("Orijinal: " + wrapper.getString());
            ImmutableStringWrapper modifiedWrapper = wrapper.appendText(" Yeni metin.");
            System.out.println("Orijinal Değiştirilmedi: " + wrapper.getString());
            System.out.println("Değiştirilen: " + modifiedWrapper.getString());
        }
    }

    final class ImmutableStringWrapper {
        private final String string;

        public ImmutableStringWrapper(String string) {
            this.string = string;
        }

        public String getString() {
            return string;
        }

        public ImmutableStringWrapper appendText(String text) {
            return new ImmutableStringWrapper(this.string + text);
        }
    }



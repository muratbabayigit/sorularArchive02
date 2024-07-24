package Projeler.JavaPRC_Archive.practice_day08;
// Soru: Immutable bir sınıf nasıl oluşturulur? Bir sınıfın değişmez (immutable) olması için
// nasıl adımlar atılır?

public class ImmutableClass {

    public final class ImmutableExample{

        public final String message; //final kelimesi ile değişmezlik özelliği tanılmanıyor


       public ImmutableExample(String message) { //metod ile değer atıyoruz
           this.message = message;
       }
        public String getMessage(){ //get metodu ile atanan değere ulaşıyorum.
            return message;
    }
    }
}

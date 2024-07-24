package Projeler.JavaPRC_Archive.practice_day08;
// Soru: Referans veri tiplerinin nasıl çalıştığını anlamak için bir nesnenin bir metoda
// geçirilmesinin orijinal nesneyi nasıl etkilemediğini gösteren bir örnek yapınız.

public class passByValue {
    public static void main(String[] args) {
    StringBuilder text=new StringBuilder("Merhaba"); //Başlngıç metnini belirledik
        System.out.println("İlk Metin: "+text);
        modify(text);
        System.out.println("Son Metin: "+text);

}

     static void modify(StringBuilder str) {
        str.append(" Java");
        System.out.println("Metod İçinde: "+str);
    }
}
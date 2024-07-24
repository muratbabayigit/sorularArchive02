package Projeler.JavaPRC_Archive.P10_MethodCreation;

public class Soru1 {
    static String output="";
    public static void main(String[] args) {
        String input="Kendi basina calismak da guzel";
        stringdekiHarfleriYazdir(input,3,7);
    }

    private static void stringdekiHarfleriYazdir(String input,int baslangic,int bitis) {
        if (baslangic>bitis){
            System.out.println("HATA: Baslangic değeri bitişten küçük olmalıdır.");
        }
        if (baslangic>input.length()||bitis>input.length()){
            System.out.println("HATA: String indeks sınırları dışında bir giriş yaptınız");
        }
        input=input.replace(" ","");
        for (int i = baslangic; i < bitis; i++) {

            output+=input.charAt(i)+",";

        }
        System.out.print(output);

    }
}

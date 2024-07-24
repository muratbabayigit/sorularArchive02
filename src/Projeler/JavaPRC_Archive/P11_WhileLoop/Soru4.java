package Projeler.JavaPRC_Archive.P11_WhileLoop;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String karakter="";
        int toplam=0;
        int sayiSayaci=0;
        int sayi;
        while (!((karakter.equals("Q"))||(karakter.equals("q")))) {

            System.out.println("Toplamak üzere pozitif tam sayi girin," +
                    " çıkmak için Q'ya basın");
            if (scan.hasNextInt()){//chatgGPT den yardım aldım. kullanıcının
                                    //string mi int mi girdiğini bu şekilde anlayabiliriz
             sayi = scan.nextInt();
                if (sayi<0) System.out.println("Negatif sayi kullanamazsiniz");
                else {
                    toplam += sayi;
                    sayiSayaci++;
                }
            }
            else if (scan.hasNextLine()) {
                karakter=scan.nextLine();

            }

        }
        System.out.println("Girdiğiniz "+sayiSayaci+" adet sayinin toplami: "+toplam);
    }
}

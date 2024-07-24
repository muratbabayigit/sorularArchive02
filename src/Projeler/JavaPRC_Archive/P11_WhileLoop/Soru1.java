package Projeler.JavaPRC_Archive.P11_WhileLoop;

public class Soru1 {
    static int sayi=10;
    static String sayilar="";
    public static void main(String[] args) {

        while (sayi<100){

            if (sayi%7==0){
                sayilar+=sayi+",";
            }
                sayi++;
            }
        System.out.print(sayilar);
        }

    }


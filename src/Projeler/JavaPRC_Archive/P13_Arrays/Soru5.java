package Projeler.JavaPRC_Archive.P13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayiSoraSoraOlustur()));
    }

    private static int[] arrayiSoraSoraOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen array boyutunu giriniz:");
        int length= scan.nextInt();
        int[] array=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Array'e element ekleyiniz");
            array[i]=scan.nextInt();
        }
        return array;
    }
}

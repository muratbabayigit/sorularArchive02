package Projeler.JavaPRC_Archive.P08_String_Manipulations;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        String input1="15.30 €";
        String input2="11.40 €";

       double deger1=Double.parseDouble(input1.replace("€",""));
       double deger2=Double.parseDouble(input2.replace("€",""));

       double toplam=deger1+deger2;
        System.out.println(Double.toString(toplam)+" €");
    }
}

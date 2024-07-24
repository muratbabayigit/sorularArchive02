package Projeler.JavaPRC_Archive.P08_String_Manipulations;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime=scan.nextLine();
        String str1="";
        String str2="";

        if (kelime.length()%2==0){
            str1=kelime.substring(0,kelime.length()/2);
            str2=kelime.substring(kelime.length()/2);
            kelime=str1+":)"+str2;
            System.out.println(kelime);
        }else {

            str1=kelime.substring(0,((kelime.length()-1)/2)+1);
            str1=str1.substring(0,(kelime.length()-1)/2);
            str2=kelime.substring(((kelime.length()-1)/2)+1);
            kelime=str1+":("+str2;
            System.out.println(kelime);

        }

    }
}

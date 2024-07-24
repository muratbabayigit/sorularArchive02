package Projeler.JavaPRC_Archive.P21_StringBuilder._13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak 
		cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan)
	         bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Bir metin giriniz: ");
    	String str=scanner.nextLine();
    	StringBuilder sb=new StringBuilder(str);
    	
    	String tersMetin=sb.reverse().toString();
    	if (tersMetin.equalsIgnoreCase(str)) {
			System.out.println("girilen metin palindrom ifadedir: "+tersMetin);
			
		}else {
			
			System.out.println("girilen metin palindrom ifade değilir "+tersMetin);
		}
    	
    }

}

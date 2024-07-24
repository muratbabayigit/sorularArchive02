package Projeler.JavaPRC_Archive.P04_If_Else_Statements._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bi say� girive: ");
		double sayi1=scan.nextDouble();
		System.out.println("Bi dene daha say� girive:");
		double sayi2=scan.nextDouble();
		System.out.println("i�lem se�iniz(+,-,*,/)");
		char islem=scan.next().charAt(0);
		if (islem=='+') {
			System.out.println("say�lar�n toplam�:"+(sayi1+sayi2));
		} else if(islem=='-'){
			System.out.println("say�lar�n fark�: "+(sayi1-sayi2));

		}else if(islem=='*') {
			System.out.println("say�lar�n �arp�m�: "+(sayi1*sayi2));
			
		 
		}else if (islem=='/') {
			System.out.println("say�lar�n b�l�m�:"+(sayi1/sayi2));
			
		}else {
			System.out.println("beni bak d�zg�n i�lem se�!!");
		} 
		{
			
		}
		
		
		
		
	}

}

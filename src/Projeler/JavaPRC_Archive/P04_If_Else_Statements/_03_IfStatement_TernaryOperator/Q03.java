package Projeler.JavaPRC_Archive.P04_If_Else_Statements._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("boyunuzu giriniz:(cm) ");
		double boy=(scan.nextDouble())/100;
		System.out.println("kilonuzu giriniz:(kg) ");
		double kilo=scan.nextDouble();
		
		double vki=kilo/(boy*boy);
		
		if (vki<=20) {
			System.out.println("Olduk�a zay�fs�n.");
			
		} else if(vki<=25) {
			System.out.println("Normal S�n�rdas�n�z.");

		} else if (vki<=30) {
			System.out.println("�i�man kategorisindesiniz");
		}else {
			System.out.println("obezsiniz.");
		}
		{
			
		}
		
		
    }

}

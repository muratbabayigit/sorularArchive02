package Projeler.JavaPRC_Archive.P04_If_Else_Statements._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner scan=new Scanner(System.in);
		System.out.print("Ya��n�z� giriniz: ");
		int yas=scan.nextInt();
		System.out.print("kilonuzu giriniz: ");
		int kilo=scan.nextInt();
		System.out.println(yas<18 ? "kan ba���� yapamaz!!":(kilo<50 ? "kan ba���� yapamaz!!"
							:"kan ba���� yapabilir!"));
		scan.close();
		}

}

/**
 *
 * @author omerc
 */
package Projeler.FaizUygulamasi.src.faizuygulamasi;

import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faiz oranımız %6'dır\n***********");
        int anapara,vade;
        System.out.print("Yatirmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranizi kaç yıl vadeli yatırmak istiyorsunuz ? : ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;

        double faizorani = 0.06;
        for(int i = 1 ;i<=vade;i++){
            toplampara = (faizorani*toplampara) + toplampara;

        }
        System.out.println("hesaplanıyor.....");
        Thread.sleep(vade*1000);
        System.out.println(vade+".yilin sonunda para miktari : "+toplampara);
    }
    
}

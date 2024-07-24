package Projeler.JavaPRC_Archive.practice_day02;

import java.util.Scanner;

public class nextLineAtlamaSorunuCozumu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Adınızı Soyadınız: ");
            String name = scanner.nextLine();

            System.out.print("Yaşınız: ");
            int age = scanner.nextInt();
            //scanner.nextInt() ile değer aldıktan sonra  scanner.nextLine(); ile değer istenirse sorun çıkıyor.
            // Atlama problemi oluşuyor
            // Sorunu çözmek için aşağıdaki scanner.nextLine();  satır ekleniyor. Bu satırsonu arabellekte kalan karakteri kullanalım.
            // Alttaki satırı yoruma alarak çalıştırıp sorunu görebilirsiniz
           scanner.nextLine();

            System.out.println("Mesleğiniz nedir?: ");
            String job = scanner.nextLine();
            System.out.println("Güzel bir meslek: "+ job);


            scanner.close();


        }

    }


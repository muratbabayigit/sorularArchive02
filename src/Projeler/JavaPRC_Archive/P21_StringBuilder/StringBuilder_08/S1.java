package Projeler.JavaPRC_Archive.P21_StringBuilder.StringBuilder_08;

public class S1 {
    // Soru: Verilen bir metin içinde belirli bir karakterin sayısını bulan bir fonksiyon nasıl yazılır?
// StringBuilder kullanarak bir metinde belirli bir karakterin kaç kez geçtiğini bulan bir örnek yapınız.


        public static void main(String[] args) {
            String text = "Merhaba dünya! Hoş geldiniz.";
            char targetChar = 'a';
            int count = countCharacter(text, targetChar);
            System.out.println("'" + targetChar + "' karakteri " + count + " kez geçiyor.");
        }

        static int countCharacter(String text, char target) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == target) {
                    count++;
                }
            }
            return count;
        }
    }



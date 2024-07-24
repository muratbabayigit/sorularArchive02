public class Q01_ReverseString {
        /* Task->
	     Stringi tersten print için
		1.Yol: StringBuilder () kullanarak
		2.Yol: String Classini kullanarak
		3.Yol: Bir method create ediniz
    */
//1. StringBuilder() kullanarak
    public static void main(String[] args) {
        String str = "Merhaba";

        StringBuilder reversed = new StringBuilder();
        reversed.append(str);
        reversed = reversed.reverse();

        System.out.println("Tersten yazılmış hali: " + reversed);
    }





//2. String Class'ını kullanarak
//    public static void main(String[] args) {
//        String str = "Merhaba";
//
//        System.out.println("Tersten yazılmış hali: " + reverseString(str));
//    }




//3. Bir method create ediniz:
//    public static String reverseString(String str) {
//        String reversed = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//
//        return reversed;
//    }
}//class sonu

package Projeler.JavaPRC_Archive.P08_String_Manipulations;

public class Soru3 {
    static String input="java1 ogRe2@nMek3 #ne +Gu=zel";
    static String output="";
    public static void main(String[] args) {


        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))){
                output+=input.charAt(i);
            }
        }
        System.out.println(output.toLowerCase());
    }
}

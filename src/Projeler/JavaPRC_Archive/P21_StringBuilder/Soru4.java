package Projeler.JavaPRC_Archive.P21_StringBuilder;

public class Soru4 {
    public static void main(String[] args) {
        int total=0;
        StringBuilder letters=new StringBuilder("abcdefg");
        total+=letters.substring(1,2).length();
        total+=letters.substring(6,6).length();
      //  total+=letters.substring(6,5).length();
        System.out.println(total);
        String a="";
        System.out.println(a.length());
    }
}

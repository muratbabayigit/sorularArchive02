package Projeler.JavaPRC_Archive.P11_WhileLoop;

public class Soru3 {
    public static void main(String[] args) {

        String str="Hasta iken java çalışmak ayrı bir eziyet";
        terseCevir(str);
    }

    private static void terseCevir(String str) {
       String tersStr="";
       int index=str.length();
        while (index>0){
            tersStr+=str.substring(str.length()-1);
            str=str.substring(0,str.length()-1);
            index--;
        }
        System.out.println(tersStr);
    }
}

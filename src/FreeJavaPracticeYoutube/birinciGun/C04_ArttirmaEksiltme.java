package FreeJavaPracticeYoutube.birinciGun;

public class C04_ArttirmaEksiltme {
    public static void main(String[] args) {
        int a=20;
        int b=a++; //önce atamayı yap sonra a'yı arttır
        int c=++a;//önce artır sonra atama yap

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int ab1=20;
        System.out.println(ab1++ + ++ab1);// 20+22= 42 olarak görürürüz
        System.out.println("ab1 = " + ab1);
    }
}

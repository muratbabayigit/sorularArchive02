package FreeJavaPracticeYoutube.birinciGun;

public class C05_RegexKarakterler {
    public static void main(String[] args) {
        /*
        Regex: bütün harfler, bütün sayilar, bütün semboller, bütün boşluklar
        örneğin bir seri no daki harfleri kaldır, yada iban no daki sayılar vs vs

         */

        String test="Java 1235 ?!@_";

       // \\d tüm sayıları * la değiştir dedik
        System.out.println(test.replaceAll("\\d", "*"));// Java **** ?!@_
        System.out.println(test);// orjinali değişmez. çünkü string immutable biliyosun //Java 1235 ?!@_

        //  \\D rakamlar dışındaki herşeyi siler
        String hesapNo="tr2345 23458645 234235 4565 43 42 3";
        System.out.println(hesapNo.replaceAll("\\D", ""));//234523458645234235456543423

        // \\S space dışındaki herşeyi sil yapalım
        System.out.println(hesapNo.replaceAll("\\S", ""));// 6 tane boşluk görülür konsolda

        // \\w


        // \\W
    }
}

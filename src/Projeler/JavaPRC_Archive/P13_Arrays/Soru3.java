package Projeler.JavaPRC_Archive.P13_Arrays;

import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {

        int[] input={4,5,6,7};
        System.out.println(Arrays.toString(elementleriSagaKaydir(input)));
    }

    private static int[] elementleriSagaKaydir(int[] input) {
        int[] arrYeni=new int[input.length];
        arrYeni[0]=input[input.length-1];
        for (int i = 0; i < input.length-1; i++) {
            arrYeni[i+1]=input[i];
        }
        input=arrYeni;

        return input;
    }
}

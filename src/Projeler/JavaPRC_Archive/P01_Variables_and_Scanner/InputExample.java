package Projeler.JavaPRC_Archive.P01_Variables_and_Scanner;

import javax.swing.JOptionPane;

public class InputExample {
    public static void main(String[] args) {
        // Kullanıcıdan bir metin girişi al
        String userInput = JOptionPane.showInputDialog("Lütfen bir metin giriniz:");

        // Kullanıcının girdiği metni ekrana yazdır
        System.out.println("Kullanıcının girdiği metin: " + userInput);
    }
}
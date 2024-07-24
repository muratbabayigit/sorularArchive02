package Projeler.JavaPRC_Archive.P21_StringBuilder.StringBuilder_08;

public class S3 {
    // Soru: String birleştirme işlemi için neden StringBuilder tercih edilir?
    // String ve StringBuilder arasındaki farkları açıklayan bir örnek yapınız.


        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";

            // String birleştirme işlemi
            String fullName = firstName + " " + lastName;

            // StringBuilder kullanarak birleştirme işlemi
            StringBuilder fullNameBuilder = new StringBuilder();
            fullNameBuilder.append(firstName).append(" ").append(lastName);

            System.out.println("String Birleştirme: " + fullName);
            System.out.println("StringBuilder Kullanarak Birleştirme: " + fullNameBuilder.toString());
        }
    }


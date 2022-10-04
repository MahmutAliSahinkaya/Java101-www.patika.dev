import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;
        Scanner kenar = new Scanner(System.in);
        System.out.println("Üçgene Alanının Hesaplanması Uygulamasına Hoşgeldiniz...");
        System.out.print("1. Kenarın Uzunluğunu Giriniz : ");
        a = kenar.nextInt();
        System.out.print("2. Kenarın Uzunluğunu Giriniz : ");
        b = kenar.nextInt();
        System.out.print("3. Kenarın Uzunluğunu Giriniz : ");
        c = kenar.nextInt();

        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı : " + alan);
    }
}

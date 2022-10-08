import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        double kilo;
        double vki;

        Scanner input = new Scanner(System.in);
        System.out.println("Vücut Kitle İndeksi Hesaplama Programına Hoşgeldiniz...");
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}

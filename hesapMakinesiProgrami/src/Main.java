import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, select;
        double n2;

        Scanner input = new Scanner(System.in);

        System.out.println("Hesap Makinesi Programına Hoşgeldiniz...");
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                String s = (n2 == 0) ? "Bir sayı 0'a bölünemez!" : "Bölüm : " + (n1 / n2);
                System.out.println(s);
                break;
            default:
                System.out.println("Hatalı bir işlem yaptınız!");
        }
    }
}
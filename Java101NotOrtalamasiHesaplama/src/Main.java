import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();
        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();
        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;

        System.out.println("Not ortalamanız: " + ortalama);

        String durum = (ortalama >= 60) ? "Tebrikler! Sınıfı Geçtiniz." : "Üzgünüz! Sınıfta Kaldınız.";
        System.out.println(durum);
    }
}
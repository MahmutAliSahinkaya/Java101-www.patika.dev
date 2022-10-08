import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, number = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        if ((0 <= mat) && (mat <= 100)) {
            total += mat;
            number++;
        } else {
            total = total;
        }
        if ((0 <= fizik) && (fizik <= 100)) {
            total += fizik;
            number++;
        } else {
            total = total;
        }
        if (0 <= turkce && turkce <= 100) {
            total += turkce;
            number++;
        } else {
            total = total;
        }
        if (0 <= kimya && kimya <= 100) {
            total += kimya;
            number++;
        } else {
            total = total;
        }
        if (0 <= muzik && muzik <= 100) {
            total += muzik;
            number++;
        } else {
            total = total;
        }
        double average = total / number;

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız :" + average);
        } else if (number == 0 || (average > 100) || (average < 0)) {
            System.out.println(" Hatalı değer ya da değerler girdiniz lütfen yeniden doğdu değerleri giriniz !");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz !");
            System.out.println("Ortalamanız :" + average);
        }
    }
}

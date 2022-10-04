import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, kilo, toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplam = armut * kilo;
        System.out.print("Elma Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplam += elma * kilo;
        System.out.print("Domates Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplam += domates * kilo;
        System.out.print("Muz Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplam += muz * kilo;
        System.out.print("Patlıcan Kaç Kilo ? :");
        kilo = input.nextDouble();
        toplam += patlican * kilo;

        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
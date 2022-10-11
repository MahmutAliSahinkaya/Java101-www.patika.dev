import java.util.Scanner;

public class Main {
    static void isPrime(int number, int index) {
        if (index == number) {
            System.out.println(number + " sayısı ASALDIR!");
            return;
        } else if (number % index == 0) {
            System.out.println(number + "sayısı ASAL değildir!");
            return;
        }
        isPrime(number, index + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = inp.nextInt();
        isPrime(number, +2);
    }
}
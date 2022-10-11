import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int n = inp.nextInt();

        if (isPalindrom(n)) {
            System.out.println(n + " sayısı Palindrom bir sayıdır.");
        } else {
            System.out.println(n + " sayısı Palindrom bir sayı değildir.");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (n == total) {
            System.out.println(n + " Mükemmel sayıdır.");
        } else {
            System.out.println(n + " Mükemmel sayı değildir.");
        }
    }
}

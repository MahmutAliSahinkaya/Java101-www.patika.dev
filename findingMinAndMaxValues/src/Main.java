import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbers, number, min = 1, max = 1;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        numbers = input.nextInt();

        for (int i = 1; i <= numbers; i++) {
            System.out.print(i + " . Sayıyı Giriniz: ");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, loop = 0, total = 0;
        double average;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = inp.nextInt();
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println("Ortak bölünen sayı : " + i);
                total += i;
                loop++;
            }
        }
        average = total / loop;
        System.out.println("3 ve 4' bölünen sayıların ortalaması : " + average);
    }
}
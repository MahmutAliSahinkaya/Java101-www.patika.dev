import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = input.nextInt();
        System.out.println("Sınır değerine kadar olan 4'ün kuvvetleri :");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Sınır değerine kadar olan 5'in kuvvetleri :");
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }
    }
}

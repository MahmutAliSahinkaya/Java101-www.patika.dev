import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int i = 1, k = 1;
        int ebob = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz :");
        n1 = inp.nextInt();
        System.out.print("n2 sayisini giriniz :");
        n2 = inp.nextInt();

        while (n1 >= i) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB = " + ebob);
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                break;
            }
            k++;
        }
        System.out.println("EKOK = " + (n1 * n2) / ebob);
    }
}

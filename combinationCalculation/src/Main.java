import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double combination;
        Scanner scan = new Scanner(System.in);
        System.out.print("N elemanlı kümenin eleman sayıları : ");
        int n = scan.nextInt();
        System.out.print("r elemanlı farklı grupların sayısı : ");
        int r = scan.nextInt();
        int ntotal = 1;
        int rtotal = 1;
        int nrtotal = 1;
        if ((n >= r) && (n > 0) && (r > 0)) {
            for (int i = 1; i <= n; i++) {
                ntotal = ntotal * i;
            }
            for (int j = 1; j <= r; j++) {
                rtotal = rtotal * j;
            }
            for (int k = 1; k <= (n - r); k++) {
                nrtotal = nrtotal * k;
            }
            combination = ntotal / (rtotal * nrtotal);
            System.out.println("C (" + n + "," + r + ") = " + combination);
        } else {
            System.out.println("Tanımsız değerler girildi.");
        }
    }
}

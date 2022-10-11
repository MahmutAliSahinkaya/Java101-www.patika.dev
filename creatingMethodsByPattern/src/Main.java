import java.util.Scanner;

public class Main {
    static int negative(int x) {
        if (x <= 0) {
            return x;
        } else {
            System.out.print(x + " ");
            int negative = negative(x - 5);
            return negative;
        }
    }
    static int positive(int x, int y) {
        if (x > y) {
            return x;
        } else {
            System.out.print(x + " ");
            return positive(x+5,y);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısı :");
        int number = inp.nextInt();
        positive(negative(number), number);
    }
}




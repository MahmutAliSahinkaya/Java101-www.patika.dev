
public class Main {
    public static void main(String[] args) {

        int result;
        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                result = i % j;
                if (result == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
    }
}


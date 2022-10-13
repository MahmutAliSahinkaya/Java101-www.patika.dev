import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        int numbers;
        int[] arr = new int[size];
        System.out.print("Dizinin boyutu n :");
        size = input.nextInt();
        arr = new int[size];

        if (size > 0) {
            System.out.println("Dizinin elemanlarını giriniz :");
            for (int i = 0; i < arr.length; i++) {
                System.out.print((i + 1) + ".Elemanı : ");
                arr[i] = input.nextInt();
            }
            System.out.println("Değerlerle oluşturulan dizi :" + Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = 0;
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Sıralama :" + Arrays.toString(arr));
        } else {
            System.out.println("Geçersiz bir dizi boyutu girdiniz.");
        }
    }
}

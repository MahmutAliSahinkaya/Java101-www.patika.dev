import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number = 5;
        int nearMinNumber = list[0];
        int nearMaxNumber = list[0];
        System.out.println("Dizi :" + Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                int temp = 0;
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    for (int k : list) {
                        if (k < number) {
                            nearMinNumber = k;
                        }
                    }
                    for (int k : list) {
                        if (k > number) {
                            nearMaxNumber = k;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("Girilen Sayı : " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearMinNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearMaxNumber);
    }
}

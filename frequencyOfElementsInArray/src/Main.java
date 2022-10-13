import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequencyArr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequencyArr[j] = visited;
                }
            }
            if (frequencyArr[i] != visited)
                frequencyArr[i] = count;
        }
        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.println("Tekrar sayıları");
        for (int i = 0; i < frequencyArr.length; i++) {
            if (frequencyArr[i] != visited)
                System.out.println(arr[i] + " sayısı " + frequencyArr[i] + " kere tekrar edildi.");
        }
    }
}







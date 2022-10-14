import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz.");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz !");
        System.out.print("Satır Sayısı : ");
        row=input.nextInt();
        System.out.print("Sütun Sayısı : ");
        column=input.nextInt();

        Minesweeper mine = new Minesweeper(row,column);
        mine.run();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        int merkezAci;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Daire Diliminin Merkez Acısını Derece Cinsinden Giriniz : ");
        merkezAci = inp.nextInt();
        double daireDilimininAlani = ((pi * (r * r) * merkezAci) / 360);

        System.out.println("Daire Diliminin Alanı: " + daireDilimininAlani);
    }
}

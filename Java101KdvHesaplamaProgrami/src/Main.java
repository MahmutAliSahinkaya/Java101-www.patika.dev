import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar, kdv;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        boolean kdvOrani = (0 < tutar) && (tutar < 1000);
        kdv = kdvOrani ? 0.18 : 0.08;
        kdvTutar = tutar * kdv;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdv);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutar :" + kdvliTutar);
    }
}

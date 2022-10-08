import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dayOfBirth;
        String chineseZodiac = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dayOfBirth = input.nextInt();
        int result = dayOfBirth % 12;

        switch (result) {
            case 0:
                chineseZodiac = "Maymun";
                break;
            case 1:
                chineseZodiac = "Horoz";
                break;
            case 2:
                chineseZodiac = "Köpek";
                break;
            case 3:
                chineseZodiac = "Domuz";
                break;
            case 4:
                chineseZodiac = "Fare";
                break;
            case 5:
                chineseZodiac = "Öküz";
                break;
            case 6:
                chineseZodiac = "Kaplan";
                break;
            case 7:
                chineseZodiac = "Tavşan";
                break;
            case 8:
                chineseZodiac = "Ejderha";
                break;
            case 9:
                chineseZodiac = "Yılan";
                break;
            case 10:
                chineseZodiac = "At";
                break;
            case 11:
                chineseZodiac = "Koyun";
                break;
            case 12:
                chineseZodiac = "Horoz";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz :" + chineseZodiac);
    }
}

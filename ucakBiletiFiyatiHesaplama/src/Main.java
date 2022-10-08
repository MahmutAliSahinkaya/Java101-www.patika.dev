import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance = 0, age, tripType;
        double tripTypeDiscount = 0.20;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tripType = input.nextInt();

        double total = (distance * 0.10);
        double discountType = 2 * (total - (total * 0.20));
        double kidsAgeDiscount = ((total) - (total * 0.50));
        double youngAgeDiscount = ((total) - (total * 0.10));
        double oldAgeDiscount = ((total) - (total * 0.30));
        double kidsAgeDiscountTripType = 2 * (kidsAgeDiscount - (kidsAgeDiscount * tripTypeDiscount));
        double youngAgeDiscountTripType = 2 * (youngAgeDiscount - (youngAgeDiscount * tripTypeDiscount));
        double oldAgeDiscountTripType = 2 * (oldAgeDiscount - (oldAgeDiscount * tripTypeDiscount));

        if ((distance > 0) && (age > 0)) {
            if ((tripType > 0) && (tripType < 3)) {
                switch (tripType) {
                    case 1:
                        if (age < 12) {
                            System.out.println("Toplam Tutar : " + kidsAgeDiscount);
                        } else if ((age >= 12) && (age <= 24)) {
                            System.out.println("Toplam Tutar : " + youngAgeDiscount);
                        } else if (age > 65) {
                            System.out.println("Toplam Tutar : " + oldAgeDiscount);
                        } else {
                            System.out.println("Toplam Tutar : " + total);
                        }
                        break;
                    case 2:
                        if (age < 12) {
                            System.out.println("Toplam Tutar : " + kidsAgeDiscountTripType);
                        } else if ((age >= 12) && (age <= 24)) {
                            System.out.println("Toplam Tutar : " + youngAgeDiscountTripType);
                        } else if (age > 65) {
                            System.out.println("Toplam Tutar : " + oldAgeDiscountTripType);
                        } else {
                            System.out.println("Toplam Tutar : " + discountType);
                        }
                        break;
                    default:
                        isError = true;
                }
            }
        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("İyi yolculuklar...");
        }
    }
}
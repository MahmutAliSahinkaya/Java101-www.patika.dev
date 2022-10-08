import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int option;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("admin") && (password.equals("java123"))) {
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        } else if (userName.equals("admin") && !(password.equals("java123"))) {
            System.out.println("Girilen şifre yanlış. \nŞifrenizi değiştirmek isterseniz 1'e basınız. \nÇıkş yapmak için 2'ye basınız");
            option = inp.nextInt();
            inp.nextLine();
            if (option == 2) {
                System.out.println("Çıkış yapıldı.");
            } else if (option == 1) {
                System.out.println("Lütfen yeni şifrenizi giriniz : ");
                newPassword = inp.nextLine();
                password = newPassword;
                if (password.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen eski şifrenizin haricinde başka şifre giriniz");
                }else
                    System.out.println("Yeni şifre oluşturuldu");
            }
        }
    }
}





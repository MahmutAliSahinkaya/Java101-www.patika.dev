import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        String word = input.next();
        boolean status = true;

        for (int i = 0; i<word.length()/2;i++){
            if (word.charAt(i)!=word.charAt(word.length()-i-1)){
                status=false;
            }
        }
        if (status==true){
            System.out.println(word + " : Palindrom bir kelimedir.");
        }else {
            System.out.println(word + " : Palindrom bir kelime değildir.");
        }
    }
}
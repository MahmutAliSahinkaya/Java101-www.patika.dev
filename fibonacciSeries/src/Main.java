import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("Basamak sayisini girin ;");
        int numbers=inp.nextInt();
        int n1=0, n2=1,n3;
        for (int i=1;i<=numbers;i++){
            n3=n1+n2;
            System.out.println(n1+"+"+n2+"="+n3);
            n1=n2;
            n2=n3;
        }
    }
}
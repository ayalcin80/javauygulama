
import java.util.Scanner;

public class uslusayihesaplama {
    public static void main(String[] args) {
        int a, b, total = 1;
        System.out.println("Uslu Sayi Hesaplama Programina Hos Geldiniz!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Sayisini Giriniz : ");
        a = scan.nextInt();
        System.out.print("Us Sayisini Giriniz : ");
        b = scan.nextInt();

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println("Islemin Sonucu " + total);


    }


}

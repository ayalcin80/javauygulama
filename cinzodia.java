import javax.swing.*;
import java.util.Scanner;

 /* Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun */

public class cinzodia {
    public static void main(String[] args) {
        int year ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz : ");
        year = sc.nextInt();


        switch ( year % 12) {
            case 0 :
                System.out.print("Burcunuz maymun");
                break;
            case 1 :
                System.out.println("Burcunuz Horoz");
                break;
            case 2 :
                System.out.println("Burcunuz kopek");
                break;
            case 3 :
                System.out.println("Burcunuz Domuz");
                break;
            case 4 :
                System.out.println("Burcunuz Fare ");
                break;
            case 5 :
                System.out.println("Burcunuz Okuz");
                break;
            case 6 :
                System.out.println("Burcunuz Kaplan");
                break;
            case 7 :
                System.out.println("Burcunuz Tavsan");
                break;
            case 8 :
                System.out.println("Burcunuz Ejderha");
                break;
            case 9 :
                System.out.println("Burcunuz Yilan");
                break;
            case 10 :
                System.out.println("Burcunuz At");
                break;
            case 11 :
                System.out.println("Burcunuz Koyun");
                break;

            default:
                System.out.println("hatali yil girdiniz");

        }

    }
}
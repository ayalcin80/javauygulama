import java.util.Scanner;
public class main {

    public static void daireninalanihesaplama(String[] args) {

        double r,a,𝜋= 3.14,alan;
        Scanner daire = new Scanner(System.in);
        System.out.print("Yari Capi Giriniz: ");
        r = daire.nextDouble();
        System. out.print("Daire Alani Giriniz: ");
        a = daire.nextDouble();

        alan = (𝜋 *(r*r)*a)/360;
        System.out.println(alan);



    }
}
import java.util.Scanner;
public class DikucgenHipetonuscevrealan {
    public static void main(String[] args) {


        //Üçgenin Kenarlarını tanımla
        double kenar1;
        double kenar2;
        double hipotenus;
        double uDegeri;
        double cevre;
        double alan;

        //Kullanıcıdan Kenarlar Uzunluklarını al
        Scanner sc=new Scanner(System.in);

        System.out.print("Birinci Kenar Uzunluğu Gir: ");
        kenar1=sc.nextDouble();

        System.out.print("Birinci Kenar Uzunluğu Gir: ");
        kenar2=sc.nextDouble();

        //Hipotenüsü Hesapla
        hipotenus=Math.sqrt( (kenar1*kenar1) + (kenar2*kenar2));

        //uDegerini Hesapla
        uDegeri=(kenar1 + kenar2 + hipotenus)/2 ;

        //Çevre Hesapla
        cevre=2*uDegeri ;

        //Alan Hesapla
        alan=Math.sqrt((uDegeri*(uDegeri-kenar1)*(uDegeri-kenar2)*(uDegeri-hipotenus)));
        //Ekrana Yazdır
        System.out.println("----------------------------------------");
        System.out.println("| Birinci Kenar  :| "+kenar1);
        System.out.println("| ----------------|--------------------|");
        System.out.println("| İkinci Kenar   :| "+kenar2);
        System.out.println("| ----------------|--------------------|");
        System.out.println("| Hipotenüs      :| "+hipotenus);
        System.out.println("| ----------------|--------------------|");
        System.out.println("| Üçgenin Çevresi:| "+cevre);
        System.out.println("|-----------------|--------------------|");
        System.out.println("| Üçgenin Alanı  :| "+alan);
        System.out.println("----------------------------------------");
    }
}

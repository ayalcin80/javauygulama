import java.util.Scanner;

//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
public class kucuktenbuyugesirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.print("1.Değeri giriniz: ");
        x = scanner.nextInt();
        System.out.print("2.Değeri giriniz: ");
        y = scanner.nextInt();
        System.out.print("3.Değeri giriniz: ");
        z = scanner.nextInt();

        if(x<y && x<z && y>z)
            System.out.println("Küçükten düyüğe sıralanması="+""+x+"-"+z+"-"+y);
        else if(y<x && y<z && x>z) {
            System.out.println("Küçükten düyüğe sıralanması="+"" + y + "-" + z + "-" + x);
        }
        else if(z<y && z<x && y>x)
            System.out.println("Küçükten düyüğe sıralanması="+""+z+">"+x+">"+y);

        else if(z>y && z>x && y>x)
            System.out.println("Küçükten düyüğe sıralanması="+""+x+">"+y+">"+z);
        else
            System.out.println("Yanlış sayı veya farklı karakter girdiniz.");
    }
}


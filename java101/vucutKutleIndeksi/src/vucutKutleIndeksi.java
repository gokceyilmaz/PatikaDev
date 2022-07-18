import java.util.Scanner;

public class vucutKutleIndeksi  {
    public static void main(String[]args) {
        double kilo, boy, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut kütle indeksiniz: " + indeks);

    }
}

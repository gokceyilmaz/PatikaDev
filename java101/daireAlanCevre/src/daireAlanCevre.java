import java.util.Scanner;
public class daireAlanCevre {
    public static void main(String[]args) {
        int r;
        double pi = 3.14,a,area;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap uzunluğunu giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();

        area = (pi * (r * r)*a)/360 ;
        System.out.print("Daire diliminin alanı: " + area);



    }
}

import java.util.Scanner;

public class kucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("3.Sayıyı Giriniz: ");
        c = input.nextInt();

        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Sayılar Birbirine Esit Olmamalıdır.");
        }else{
            if ((a < b) && (b < c)) {
                if (b < c) {
                    System.out.println(a + "<" + b + "<" + c);
                } else {
                    System.out.print(a + "<" + c + "<" + b);
                }
            } else if ((b < a) && (b < c)) {
                if (a < c) {
                    System.out.println(b + "<" + a + "<" + c);
                } else {
                    System.out.print(b + "<" + c + "<" + a);
                }
            } else {
                if (b < a) {
                    System.out.println(c + "<" + b + "<" + a);
                } else {
                    System.out.println(c + "<" + a + "<" + b);

                }
            }
        }
    }
}

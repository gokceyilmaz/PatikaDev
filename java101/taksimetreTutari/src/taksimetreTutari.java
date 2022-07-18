import java.util.Scanner;

public class taksimetreTutari {
    public static void main(String[]args){
        int km;
        double perKm = 2.20, total, startPrice = 10, minPrice = 20;

        Scanner input =new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total >= minPrice)? total:minPrice;
        System.out.println("Taksimetre tutarı: " + total);


    }
}

import java.util.Scanner;

public class manavKasa {
    public static void main(String[]args) {
        double armut =2.14, elma = 3.67, domates = 1.11, muz = 0.95,patlican =5.00 ;
        double elmaKilo,armutKilo,domatesKilo,muzKilo,patlicanKilo,toplam;

        System.out.print("Armut Kaç Kilo? : ");
        Scanner input = new Scanner(System.in);
        armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        Scanner input2 = new Scanner(System.in);
        elmaKilo = input2.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        Scanner input3 = new Scanner(System.in);
        domatesKilo = input3.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        Scanner input4 = new Scanner(System.in);
        muzKilo = input4.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        Scanner input5 = new Scanner(System.in);
        patlicanKilo = input5.nextDouble();

        toplam = (elmaKilo*elma)+(armut*armutKilo)+(domatesKilo*domates)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.print("Toplam Tutar: " + toplam + " TL");



    }
}

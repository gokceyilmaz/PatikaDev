import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
    /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
    */
        int ay,gun ;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı sayısal olarak giriniz: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        if(ay == 1){
            if(gun <= 21){
                System.out.println("Oğlak Burcu");
            }else{
                System.out.println("Kova Burcu");
            }
        }
        else if(ay == 2){
            if(gun <= 19){
                System.out.println("Kova Burcu");
            }else{
                System.out.println("Balık Burcu");
            }
        }
        else if(ay == 3){
            if(gun <= 20){
                System.out.println("Balık Burcu");
            }else{
                System.out.println("Koç Burcu");
            }
        }
        else if(ay == 4){
            if(gun <= 20){
                System.out.println("Koç Burcu");
            }else{
                System.out.println("Boğa Burcu");
            }
        }
        else if(ay == 5){
            if(gun <= 21){
                System.out.println("Boğa Burcu");
            }else{
                System.out.println("İkizler Burcu");
            }
        }
        else if(ay == 6){
            if(gun <= 22){
                System.out.println("İkizler Burcu");
            }else{
                System.out.println("Yengeç Burcu");
            }
        }
        else if(ay == 7){
            if(gun <= 22){
                System.out.println("Yengeç Burcu");
            }else{
                System.out.println("Aslan Burcu");
            }
        }
        else if(ay == 8){
            if(gun <= 22){
                System.out.println("Aslan Burcu");
            }else{
                System.out.println("Başak Burcu");
            }
        }
        else if(ay == 9){
            if(gun <= 22){
                System.out.println("Başak Burcu");
            }else{
                System.out.println("Terazi Burcu");
            }
        }
        else if(ay == 10){
            if(gun <= 22){
                System.out.println("Terazi Burcu");
            }else{
                System.out.println("Akrep Burcu");
            }
        }
        else if(ay == 11){
            if(gun <= 21){
                System.out.println("Akrep Burcu");
            }else{
                System.out.println("Yay Burcu");
            }
        }
        else if(ay == 12){
            if(gun <= 21){
                System.out.println("Yay Burcu");
            }else{
                System.out.println("Oğlak Burcu");
            }
        }
        else{
            System.out.println("Yanlış sayı girdiniz! ");
        }
    }
}

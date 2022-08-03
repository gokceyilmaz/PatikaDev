import javafx.application.Application;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int yas,yolculukTip;
        double mesafe,normalTutar,toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen km cinsinden mesafeyi giriniz: ");
        mesafe = input.nextDouble();

        if(mesafe < 1){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        } else {
            System.out.print("Yaşınız: ");
        }
        yas = input.nextInt();

        if( yas<1){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }else{
            System.out.print("Yolculuk tipini giriniz\n1-Tek Yön ,\n2-Gidiş / Dönüş : ");
        }
        yolculukTip = input.nextInt();

        if( (yolculukTip != 1) && (yolculukTip != 2)){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }

        normalTutar = (mesafe * 0.10);
        toplamTutar = normalTutar;

        if ((yas>1) && (yas<140)){
            if (yas<12){
                toplamTutar = (normalTutar-(normalTutar *0.5));
            }
            else if((yas > 12) && (yas < 24)){
                toplamTutar = (normalTutar - (normalTutar* 0.1));
            }
            else if(yas > 65){
                toplamTutar = (normalTutar - (normalTutar*0.3));
            }
            if(yolculukTip == 2){
                toplamTutar = (toplamTutar -(toplamTutar* 0.20))*2;
            }
        }

        System.out.println("Toplam tutar: "+ toplamTutar);


    }
}

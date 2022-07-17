import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[]args){
        /*
         Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
         Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
         KDV tutarı hesaplayan programı yazınız.
         */
        double kdvliFiyat,kdvsizFiyat, kdvOran , kdv;
        boolean kdvTutari;

        Scanner tutar = new Scanner(System.in);
        System.out.print("Ürün tutarını giriniz: ");
        kdvsizFiyat = tutar.nextInt();

        kdvTutari = (0 < kdvsizFiyat) && (1000 > kdvsizFiyat);
        kdvOran = kdvTutari ? 0.18d : 0.08d;

        kdv = kdvsizFiyat * kdvOran;
        kdvliFiyat = kdv + kdvsizFiyat;

        System.out.println("KDV miktarı: "+ kdv);
        System.out.println("KDV'li fiyat: " +kdvliFiyat);
    }
}

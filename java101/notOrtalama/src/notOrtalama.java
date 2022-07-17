import java.util.Scanner;
public class notOrtalama {
    public static void main(String[]args){
        int tarih,muzik,mat,fizik,kimya,turkce;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat= input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih= input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik= input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik= input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya= input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce= input.nextInt();

        int toplam = (tarih + muzik + mat + fizik + kimya + turkce);
        double sonuc = toplam / 6 ;
        System.out.println("Ortalama: " + sonuc);
        System.out.println( sonuc >= 60 ? "Geçti" : "Kaldı");



    }
}

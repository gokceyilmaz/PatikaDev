import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
        double mat,fizik,turkce,kimya,muzik,ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextDouble();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();

        if(mat<0 || mat>100) mat = 0 ;
        else if (fizik<0 || fizik>100) fizik = 0;
        else if(turkce<0 || turkce>100) turkce = 0;
        else if(kimya<0 || kimya>100) kimya = 0;
        else if(muzik<0 || fizik>100) fizik = 0;

        ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
        if(ortalama < 55) System.out.println("Kaldınız!");
        else System.out.print("Geçtiniz!");

        System.out.print("Ortalama: "+ ortalama);

    }
}

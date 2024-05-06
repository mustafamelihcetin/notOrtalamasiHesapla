import java.util.Scanner;

/**
 * Bu sınıf, öğrencinin fizik, matematik, türkçe, kimya, müzik ve tarih notlarını
 * girerek ortalama hesaplamasını yapar.
 */
public class Main {

    /**
     * Programın ana metodudur. Kullanıcıdan notları alır ve ortalama hesaplamasını yapar.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fizik, matematik, turkce, kimya, muzik, tarih, toplam = 0;

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        toplam += fizik;
        System.out.println();

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();
        toplam += matematik;
        System.out.println();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        toplam += turkce;
        System.out.println();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        toplam+=kimya;
        System.out.println();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        toplam+=muzik;
        System.out.println();


        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();
        toplam+=tarih;
        System.out.println();


        System.out.println("Ortalamanız: " + Main.findAvg(toplam));
    }

    /**
     * Verilen toplam notların ortalamasını hesaplar.
     * @param toplam Öğrencinin aldığı toplam not.
     * @return Notların ortalaması.
     */
    public static double findAvg(int toplam) {
        return (double) toplam / 6;
    }
}

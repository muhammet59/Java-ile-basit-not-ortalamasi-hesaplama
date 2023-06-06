import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Not hesaplama uygulamasina hosgeldiniz");

        System.out.println("Lutfen fizik dersi icin 1 ve 2. sinavlarinizin notlarini giriniz");
        int fizik1 = scanner.nextInt();
        int fizik2 = scanner.nextInt();

        System.out.println("Lutfen matematik dersi icin 1 ve 2. sinavlarinizin notlarini giriniz");
        int matematik1 = scanner.nextInt();
        int matematik2 = scanner.nextInt();

        System.out.println("Lutfen turkce dersi icin 1 ve 2. sinavlarinizin notlarini giriniz");
        int turkce1 = scanner.nextInt();
        int turkce2 = scanner.nextInt();

        System.out.println("Lutfen kimya dersi icin 1 ve 2. sinavlarinizin notlarini giriniz");
        int kimya1 = scanner.nextInt();
        int kimya2 = scanner.nextInt();

        System.out.println("Lutfen muzik dersi icin 1 ve 2. sinavlarinizin notlarini giriniz");
        int muzik1 = scanner.nextInt();
        int muzik2 = scanner.nextInt();

        System.out.println("Lutfen tarih dersi icin 1 ve 2. sinavlarinizin notlarini giriniz");
        int tarih1 = scanner.nextInt();
        int tarih2 = scanner.nextInt();

        int fizikNot = (fizik1+fizik2)/2;
        int matematikNot = (matematik1+matematik2)/2;
        int turkceNot = (turkce1+turkce2)/2;
        int kimyaNot = (kimya1+kimya2)/2;
        int muzikNot = (muzik1+muzik2)/2;
        int tarihNot = (tarih1+tarih2)/2;

        System.out.println("Fizik dersi icin notunuz= "+ fizikNot);
        System.out.println("Matematik dersi icin notunuz= "+ matematikNot);
        System.out.println("Turkce dersi icin notunuz= "+ turkceNot);
        System.out.println("Kimya dersi icin notunuz= "+ kimyaNot);
        System.out.println("Muzik dersi icin notunuz= "+ muzikNot);
        System.out.println("Tarih dersi icin notunuz= "+ tarihNot);

        ArrayList tumDersler = new ArrayList<>();
        {
            tumDersler.add(fizikNot);
            tumDersler.add(matematikNot);
            tumDersler.add(turkceNot);
            tumDersler.add(kimyaNot);
            tumDersler.add(muzikNot);
            tumDersler.add(tarihNot);
        }

        int tumDerslerNotToplami = fizikNot+matematikNot+turkceNot+kimyaNot+muzikNot+tarihNot;

        System.out.println("Genel not ortalamaniz= " + tumDerslerNotToplami/tumDersler.size());
    }
}
import java.util.Scanner;

public class SinifGecmeProjesi {
    public static void main(String[] args) {
        int mat, kimya, fizik, tarih, muzik, gecersizNot = 0, toplam = 5;


        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

// not değerinin 0 ile 100 olmaması koşulunu ekleyelim.

        if (mat < 0 || mat > 100) {
            mat = 0;
            gecersizNot++;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            gecersizNot++;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            gecersizNot++;
        }
        if (tarih < 0 || tarih > 100) {
            tarih = 0;
            gecersizNot++;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            gecersizNot++; // not değeri belirtilen aralık dışındaysa gecersizNot degiskeni 1 artacaktır.
        }

        double total = (mat + fizik + kimya + tarih + muzik);
        double ort = total / (toplam - gecersizNot);

        if (ort <= 55) {
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşşmek üzere!");

        } else {
            System.out.println("Tebrikler sınıf geçtiniz.");
        }

        System.out.println("Ortalamanız : " + ort);

    }
}
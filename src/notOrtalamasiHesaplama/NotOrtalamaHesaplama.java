package notOrtalamasiHesaplama;

import java.util.Scanner;

public class NotOrtalamaHesaplama {

        public static void main(String[] args) {
            // Değişkenleri oluştur

            int mat, fizik, kimya, turkce, tarih, muzik;

            Scanner input=new Scanner(System.in);

            System.out.println("Matematik notunuzu giriniz: ");
            mat = input.nextInt();

            System.out.println("Fizik notunuzu giriniz: ");
            fizik = input.nextInt();

            System.out.println("Kimya notunuzu giriniz: ");
            kimya = input.nextInt();

            System.out.println("Türkçe notunuzu giriniz: ");
            turkce = input.nextInt();

            System.out.println("Tarih notunuzu giriniz: ");
            tarih = input.nextInt();

            System.out.println("Müzik notunuzu giriniz: ");
            muzik = input.nextInt();

            int toplam = (mat + fizik + kimya +turkce +tarih + muzik);
            double sonuc = toplam / 6.0;

            System.out.println("Ortalamanız: "+ sonuc);
            System.out.println(sonuc > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");
        }
    }


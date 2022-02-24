package ucgenAlanHesaplama;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UcgenAlanHesaplama {
        public static void main(String[] args){
            //Değişkenlerimizi oluşturalım.
            int a, b, c;
            double d;

            //Kullanıcıdan verilerimizi alalım.
            Scanner girdi = new Scanner(System.in);

            System.out.println("1. Kenarı Giriniz: ");
            a = girdi.nextInt();

            System.out.println("2. Kenarı giriniz: ");
            b = girdi.nextInt();

            System.out.println("3. Kenarı giriniz: ");
            c = girdi.nextInt();

            d = (a + b + c) / 2;
            d = Math.sqrt(d*(d-a)*(d-b)*(d-c));
            System.out.println("Ücgenin alanı : " +new DecimalFormat("##.#").format(d));
        }
    }



package kdvHesaplama;

import java.util.Scanner;

public class KDVHesaplama {

    public static void main(String[] args){

        double tutar, kdvOran18 = 0.18, kdvOran08 = 0.08, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz: ");

        tutar = input.nextDouble();

        if (tutar >= 1000){
            kdvTutar = tutar * kdvOran18;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar:" + tutar);
            System.out.println("KDV Oranı:" + kdvOran18);
            System.out.println("KDV Tutar:" + kdvTutar);
            System.out.println("KDV'li Tutar:" + kdvliTutar);
        }
        else {
            kdvTutar = tutar * kdvOran08;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar:" + tutar);
            System.out.println("KDV Oranı:" + kdvOran08);
            System.out.println("KDV Tutar:" + kdvTutar);
            System.out.println("KDV'li Tutar:" + kdvliTutar);
        }
    }
}

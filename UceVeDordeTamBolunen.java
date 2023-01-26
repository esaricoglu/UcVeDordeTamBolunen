package Donguler;

import java.util.Scanner;

public class UceVeDordeTamBolunen {
    public static void main(String[] args) {
        int x;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        x = inp.nextInt();

        int sayac = 0;
        double toplam = 0;

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0) {
                toplam += i;
                sayac++;
                //System.out.println(i + "," + sayac);      Programın çalışıp çalışmadığını görmek için yazılmıştır.
            } else if (i % 4 == 0) {
                toplam += i;
                sayac++;
                //System.out.println(i + "," + sayac);      Programın çalışıp çalışmadığını görmek için yazılmıştır.
            }
        }
        System.out.println("Ortalama = " + (toplam / sayac));
    }
}

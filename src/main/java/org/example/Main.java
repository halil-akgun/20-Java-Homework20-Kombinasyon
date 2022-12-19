package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
                    Ödev
            n elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
            kombinasyonu olarak adlandırılır. n’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

            Java ile kombinasyon hesaplayan program yazınız.

            Kombinasyon formülü
            C(n,r) = n! / (r! * (n-r)!)
         */

        int n, r, z, x = 1, y = 1, s = 1, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon hesaplaması için 2 sayı giriniz. C(n,r)");

        System.out.print("İlk sayı n : ");
        n = input.nextInt();

        System.out.print("İkinci sayı r : ");
        r = input.nextInt();

        z = n - r;

        for (int i = 1; i <= n; i++) { // Girilen ilk sayının faktöriyeli
            x = x * i;
        }
        System.out.println("n! = " + x);

        for (int e = 1; e <= r; e++) { // Girilen ikinci sayının faktöriyeli
            y = y * e;
        }
        System.out.println("r! = " + y);

        for (int a = 1; a <= z; a++) { // Girilen sayıların farkının faktöriyeli
            s = s * a;
        }
        System.out.println("(n-r)! = " + s);
        result = x / (y * s); // Kombinasyon Formülü
        System.out.print("C(n,r) = n!/(r!*(n-r)!) = " + result);

    }
}
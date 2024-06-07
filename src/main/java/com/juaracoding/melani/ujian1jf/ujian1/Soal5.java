package com.juaracoding.melani.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] hargaTiketFilm = new int[5];

        int totalHargaTiketFilm = 0;

        //Perulangan untuk menginput dan menjumlahkan harga  tiket
        for (int i = 0; i < 5; i++) {
            int j = i + 1;
            System.out.print("Harga tiket film " + j + ": ");
            hargaTiketFilm[i] = scanner.nextInt();
            totalHargaTiketFilm += hargaTiketFilm[i];
        }

        System.out.println("Total harga tiket: " + totalHargaTiketFilm);
    }
}

package com.juaracoding.melani.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] namaFilm = new String[5];

        System.out.println("Daftar film biskop");

        System.out.print("Masukkan nama film 1: ");
        namaFilm[0] = scanner.nextLine();

        System.out.print("Masukkan nama film 2: ");
        namaFilm[1] = scanner.nextLine();

        System.out.print("Masukkan nama film 3: ");
        namaFilm[2] = scanner.nextLine();

        System.out.print("Masukkan nama film 4: ");
        namaFilm[3] = scanner.nextLine();

        System.out.print("Masukkan nama film 5: ");
        namaFilm[4] = scanner.nextLine();


        System.out.println("Film yang ingin ditonton");

        //Perulangan untuk menampilkan lima film yang ingin ditonton
        for (int i = 0; i < 5; i++){
            int j = i + 1;
            System.out.println(j + ". " + namaFilm[i]);
        }
    }

}

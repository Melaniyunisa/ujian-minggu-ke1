package com.juaracoding.melani.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Film: ");
        String namaFilm = scanner.nextLine();

        String namaFilmDalamHurufBesar = namaFilm.toUpperCase();
        System.out.println("nama film dalam huruf besar: " + namaFilmDalamHurufBesar);

    }
}

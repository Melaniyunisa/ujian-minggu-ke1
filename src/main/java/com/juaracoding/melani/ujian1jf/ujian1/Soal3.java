package com.juaracoding.melani.ujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pilihWeekdayOrWeekend;
        int hargaTiketWeekday = 35000;
        int hargaTiketWeekend = 45000;

        System.out.println("Silahkan pilih hari weekday atau weekend \npilih \"Yes\" jika weekday \npilih \"No\" jika weekend");
        System.out.print("Masukkan pilihan: ");
        pilihWeekdayOrWeekend = scanner.nextLine();
        System.out.println();

        //Percabangan memasukan yes atau no untuk harga weekday dan weekend
        if (pilihWeekdayOrWeekend.equals("Yes")){
            System.out.print("Jumlah Tiket: ");
            int jumlahTiket = scanner.nextInt();

            //Percabangan total harga dengan diskon atau tanpa diskon saat weekday
            if (jumlahTiket > 5){
                System.out.println("Total harga (dengan diskon): " + ((jumlahTiket * hargaTiketWeekday) - (jumlahTiket * hargaTiketWeekday * 10 / 100)));
            } else{
                System.out.println("Total harga (tanpa diskon): " + jumlahTiket * hargaTiketWeekday);
            }
        } else if (pilihWeekdayOrWeekend.equals("No")){
            System.out.print("Jumlah Tiket: ");
            int jumlahTiket = scanner.nextInt();

            //Percabangan total harga dengan diskon atau tanpa diskon saat weekend
            if (jumlahTiket > 5){
                System.out.println("Total harga (dengan diskon}: " + ((jumlahTiket * hargaTiketWeekend) - (jumlahTiket * hargaTiketWeekend * 10 / 100)));
            } else{
                System.out.println("Total harga (tanpa diskon): " + jumlahTiket * hargaTiketWeekend);
            }
        } else {
            System.out.println("pilihan yang anda masukkan salah");
        }
    }
}

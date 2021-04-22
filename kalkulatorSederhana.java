//Kalkulator Sederhana

import java.util.Scanner;


public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Kalkulator sederhana");
        System.out.println("Pilih Menu : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("Pilihan anda : ");
        int pilihan=scanner.nextInt();
        switch(pilihan){
            case 1:
                System.out.print("Masukan Angka pertama : ");
                int value = scanner.nextInt();
                System.out.print("Masukan Angka kedua : ");
                int anotherValue = scanner.nextInt();
                int result = value + anotherValue;
                System.out.println("Hasilnya adalah : " + result);
                break;
            case 2:
                System.out.print("Masukan Angka pertama : ");
                int kurang = scanner.nextInt();
                System.out.print("Masukan Angka kedua : ");
                int kurangLagi = scanner.nextInt();
                int hasil = kurang - kurangLagi;
                System.out.println("Hasilnya adalah : " + hasil);
                break;
            case 3:
                System.out.print("Masukan Angka pertama : ");
                int kali = scanner.nextInt();
                System.out.print("Masukan Angka kedua : ");
                int kaliLagi = scanner.nextInt();
                int hasil1 = kali*kaliLagi;
                System.out.println("Hasilnya adalah : " + hasil1);
                break;
            case 4:
                System.out.print("Masukan Angka pertama : ");
                int bagi = scanner.nextInt();
                System.out.print("Masukan Angka kedua : ");
                int bagiLagi = scanner.nextInt();
                int hasil2 = bagi/bagiLagi;
                System.out.println("Hasilnya adalah : " + hasil2);
                break;
            default :
                System.out.println("Anda salah memasukkan nomor");
        }
        
    }
}

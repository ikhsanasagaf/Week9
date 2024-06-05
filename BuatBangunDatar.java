package week9;

import java.util.Scanner;

public class BuatBangunDatar 
{

    public static void  main(String [] args)
    {   
        int menu;
        int sisi, panjang, lebar, tinggiBalok;
        double alas, tinggi, radius;
        Scanner inp = new Scanner(System.in);       
        do {

            System.out.println("========= Menu Bangun Datar =========");
            System.out.println("===== 1. Persegi         ============");
            System.out.println("===== 2. Persegi Panjang ============");
            System.out.println("===== 3. Segitiga        ============");
            System.out.println("===== 4. Lingkaran       ============");
            System.out.println("===== 5. Kubus           ============");
            System.out.println("===== 6. Balok           ============");
            System.out.println("===== 7. Tabung          ============");
            System.out.println("===== 8. Exit            ============");
            System.out.println("Masukkan Menu : ");
            menu = inp.nextInt();

            switch (menu)
            {
                case 1:
                    System.out.println("Masukkan sisi : ");
                    sisi = inp.nextInt();
                    BangunDatar BD = new BangunDatar(sisi);
                    System.out.println("Luas Persegi : "+BD.luas(sisi));
                    System.out.println("Keliling Persegi : "+BD.keliling(sisi));
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Masukkan panjang : ");
                    panjang = inp.nextInt();
                    System.out.println("Masukkan lebar : ");
                    lebar = inp.nextInt();
                    BangunDatar BD2 = new BangunDatar(panjang,lebar);
                    System.out.println("Luas Persegi Panjang : "+BD2.luas(panjang,lebar));
                    System.out.println("Keliling Persegi Panjang : "+BD2.keliling(panjang,lebar));
                    System.out.println("");
                    break;   

                case 3:
                    System.out.println("Masukkan alas : ");
                    alas = inp.nextDouble();
                    System.out.println("Masukkan tinggi : ");
                    tinggi = inp.nextDouble();
                    BangunDatar BD3 = new BangunDatar(alas, tinggi);
                    System.out.println("Luas Segitiga : "+BD3.luas(alas, tinggi));
                    System.out.println("");
                    break;              

                case 4:
                    System.out.println("Masukkan jari-jari : ");
                    radius = inp.nextDouble();
                    BangunDatar BD4 = new BangunDatar(radius);
                    System.out.println("Luas Lingkaran : "+BD4.luas(radius));
                    System.out.println("Keliling Lingkaran : "+BD4.keliling(radius));
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Masukkan sisi : ");
                    sisi = inp.nextInt();
                    BangunDatar BD5 = new BangunDatar(sisi);
                    BangunRuang BR = new BangunRuang(BD5.getSisi());
                    System.out.println("Volume Kubus : "+BR.volume());
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("Masukkan panjang : ");
                    panjang = inp.nextInt();
                    System.out.println("Masukkan lebar : ");
                    lebar = inp.nextInt();
                    System.out.println("Masukkan tinggi : ");
                    tinggiBalok = inp.nextInt();
                    BangunDatar BD6 = new BangunDatar(panjang, lebar);
                    BangunRuang BR2 = new BangunRuang(BD6.getPanjang(),BD6.getLebar(),tinggiBalok);
                    System.out.println("Volume Balok : "+BR2.volume(tinggiBalok));
                    System.out.println("");
                    break;

                    case 7:
                    System.out.println("Masukkan radius : ");
                    radius = inp.nextDouble();
                    System.out.println("Masukkan tinggi : ");
                    tinggi = inp.nextDouble();
                    BangunDatar BD7 = new BangunDatar(radius);
                    BangunRuang BR3 = new BangunRuang(BD7.getRadius(),tinggi);
                    System.out.println("Volume Balok : "+BR3.volume(tinggi));
                    System.out.println("");
                    break;
            }


        } while (menu != 8);
        
    
    }
}
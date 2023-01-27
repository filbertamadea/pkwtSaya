package models;

import services.BangunDatar;

public class Persegi extends BangunDatar {
    int sisi;
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    @Override
    public void Bangun() {
        System.out.println("Bangun Persegi");
        System.out.println("==============");
        int i,j;
        for(i=1; i<=5; i++) {
            for(j=1; j<=10; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    @Override
    public void Karakteristik() {
        System.out.println("1.Jumlah bidang sisi pada kubus ada 6 yang berbentuk persegi dengan ukuran panjang dan luas yang sama." + "\n" +
                "2.Mempunyai 8 titik sudut." + "\n" +
                "3.Mempunyai 12 rusuk yang sama panjang." + "\n" +
                "4.Semua sudutnya siku-siku." + "\n" +
                "5.Mempunyai 4 diagonal ruang dengan ukuran yang sama panjang." + "\n" +
                "6.Mempunyai 6 bidang diagonal yang berbentuk persegi panjang." + "\n");
    }

    @Override
    public double Luas() {
        return sisi * sisi;
    }

    @Override
    public double Keliling() {
        return 4 * sisi;
    }
}

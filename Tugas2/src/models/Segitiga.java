package models;

import services.BangunDatar;

public class Segitiga extends BangunDatar {
    int alas, tinggi;

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void Bangun() {
        System.out.println("Bangun Persegi");
        System.out.println("==============" + "\n");
        int a = 5;
        for (int b = 1; b <= a; b++){
            for (int c = 4; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    @Override
    public void Karakteristik() {
        System.out.println(
                "1.Memiliki tiga sudut yang sama besarnya, yakni 60 derajat." + "\n" +
                "2.Memiliki tiga sisi yang sama panjang." + "\n" +
                "3.Memiliki tiga sumbu simetri lipat." + "\n" +
                "4.Memiliki tiga sumbu simetri putar." + "\n" );
    }

    @Override
    public double Luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double Keliling() {
        double miring = Math.sqrt(Math.pow(alas/2, 2) + Math.pow(tinggi, 2)  );
        return (3 * miring);
    }
}

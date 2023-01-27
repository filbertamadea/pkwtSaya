package models;

import services.BangunDatar;

public class Lingkaran extends BangunDatar {
    double jari, phi=3.14;

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public void Bangun() {
        System.out.println("Bangun Lingkaran");
        System.out.println("==============");
    }

    @Override
    public void Karakteristik() {
        System.out.println("1.Memiliki 1 titik pusat (O) tepat di tengah-tengah lingkaran." + "\n" +
                "2.Memiliki 1 sisi berupa garis lengkung tertutup." + "\n" +
                "3.Lingkaran tidak memiliki titik sudut." + "\n" +
                "4.Jumlah sudut lingkaran adalah 360°." + "\n" );
    }

    @Override
    public double Luas() {
        return phi * jari * jari;
    }

    @Override
    public double Keliling() {
        return 2 * phi * jari;
    }
}

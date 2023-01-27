package models;

import services.BangunRuang;

public class Kubus extends Persegi implements BangunRuang {

    @Override
    public void Bangun() {
        System.out.println("Bangun Kubus");
        System.out.println("==============");
    }

    @Override
    public void Karakteristik() {
        System.out.println("1.Ciri-ciri kubus adalah memiliki 12 rusuk yang sama panjang." + "\n" +
                "2.Ciri-ciri kubus adalah memiliki 8 titik sudut." + "\n" +
                "3.Ciri-ciri kubus adalah memiliki 12 bidang diagonal." + "\n" +
                "4.Ciri-ciri kubus adalah memiliki 4 diagonal ruang." + "\n" );
    }

    @Override
    public double volume() {
        return Luas() * sisi;
    }

    @Override
    public double luasP() {
        return 6 * Luas();
    }
}

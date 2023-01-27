package models;

import services.BangunRuang;

public class Bola extends Lingkaran implements BangunRuang {

    @Override
    public void Bangun() {
        System.out.println("Bangun Bola");
        System.out.println("==============");
    }

    @Override
    public void Karakteristik() {
        System.out.println("1.Tidak memiliki rusuk dan titik sudut." + "\n" +
                "2.Memiliki satu bidang sisi lengkung, yakni selimut bola." + "\n" +
                "3.Terdapat jari-jari dan diameter." + "\n" +
                "4.Memiliki luas permukaan dan volume." + "\n" );
    }

    @Override
    public double volume() {
        double Volume = (phi * jari * jari * jari) * (4/3);
        return Volume;
    }

    @Override
    public double luasP() {
        double Luas = 4 * Luas();
        return Luas;
    }
}

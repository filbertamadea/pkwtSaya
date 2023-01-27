package models;

import services.BangunRuang;

public class Prisma extends Segitiga implements BangunRuang {
    int tinggiP;

    public void setTinggiP(int tinggiP) {
        this.tinggiP = tinggiP;
    }

    @Override
    public void Bangun() {
        System.out.println("Bangun Prisma");
        System.out.println("==============");
    }

    @Override
    public void Karakteristik() {
        System.out.println("1.Mempunyai sisi prisma segitiga." + "\n" +
                "2.Bentuk alas dan atapnya segitiga." + "\n" +
                "3.Rusuk tegak sama panjang Mempunyai 6 buah." + "\n" +
                "4.titik sudut Mempunyai 9 buah rusuk." + "\n" );
    }

    @Override
    public double volume() {
        double VolumePrisma = ((Luas() / 2) * tinggiP);
        return VolumePrisma;
    }

    @Override
    public double luasP() {
        double LuasPrisma = (2 * Luas()) + (Keliling() * tinggiP);
        return LuasPrisma;
    }
}

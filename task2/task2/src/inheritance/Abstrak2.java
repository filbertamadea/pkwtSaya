import java.util.Scanner;

abstract class kubus {
    private int sisi;
    public kubus(int sisi){
        this.sisi = sisi;
    }

    protected Integer getSisi() {
        return sisi;
    }

    public abstract void Kubus();
}

abstract class keterangan2 {
    private String karakteristik;

    public keterangan2(String karakteristik){
        this.karakteristik = karakteristik;
    }

    protected String getKarakteristik(){
        return karakteristik;
    }

    public abstract void deskripsi();
}

class karakteristik extends  keterangan2 {
    public karakteristik(String karakteristik){
        super(karakteristik);
    }

    @Override
    public void deskripsi() {
        System.out.println(
                "Karakteristik Kubus= " + "\n" +
                        getKarakteristik() + "\n"
        );
    }
}

class LuasP extends kubus {
    public LuasP(Integer sisi){
        super(sisi);
    }

    @Override
    public void Kubus(){
        int luas = 6 * getSisi() * getSisi();
        System.out.println("Luas permukaan kubus adalah= " + luas);
    }
}

class Volume extends kubus {
    public Volume(Integer sisi) {
        super(sisi);
    }

    @Override
    public void Kubus(){
        int volume = getSisi() * getSisi() * getSisi();
        System.out.println("Volume Persegi panjang adalah= " + volume);
    }
}

class Abstrak2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        karakteristik karakter = new karakteristik(
                "1.Jumlah bidang sisi pada kubus ada 6 yang berbentuk persegi dengan ukuran panjang dan luas yang sama." + "\n" +
                "2.Mempunyai 8 titik sudut." + "\n" +
                "3.Mempunyai 12 rusuk yang sama panjang." + "\n" +
                "4.Semua sudutnya siku-siku." + "\n" +
                "5.Mempunyai 4 diagonal ruang dengan ukuran yang sama panjang." + "\n" +
                "6.Mempunyai 6 bidang diagonal yang berbentuk persegi panjang." + "\n"
        );

        System.out.println("Sebuah Kubus");
        System.out.println("======================");


        int sisi;
        System.out.println("Sisi Kubus adalah = ");
        sisi = sc.nextInt();

        LuasP luas = new LuasP(sisi);
        Volume volume = new Volume(sisi);

        karakter.deskripsi();
        System.out.println("======================");
        luas.Kubus();
        volume.Kubus();

    }
}
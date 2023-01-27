import java.util.Scanner;

abstract class persegiPanjang {
    private int panjang;
    private int lebar;
    public persegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    protected Integer getPanjang() {
        return panjang;
    }
    protected Integer getLebar() {
        return lebar;
    }

    public abstract void PPanjang();
}

abstract class keterangan {
    private String karakteristik;

    public keterangan(String karakteristik){
        this.karakteristik = karakteristik;
    }

    protected String getKarakteristik(){
        return karakteristik;
    }

    public abstract void deskripsi();
}

class karakter extends  keterangan {
    public karakter(String karakteristik){
        super(karakteristik);
    }

    @Override
    public void deskripsi() {
        System.out.println(
                "Karakteristik Persegi Panjang = " + "\n" +
                getKarakteristik() + "\n"
        );
    }
}

class Luas extends persegiPanjang {
    public Luas(Integer panjang, Integer lebar){
        super(panjang, lebar);
    }

    @Override
    public void PPanjang(){
        int luas = getPanjang() * getLebar();
        System.out.println("Luas Persegi panjang adalah= " + luas);
    }
}

class Keliling extends persegiPanjang {
    public Keliling(Integer panjang, Integer lebar) {
        super(panjang, lebar);
    }

    @Override
    public void PPanjang(){
        int keliling = 2 * (getPanjang() + getLebar());
        System.out.println("Keliling Persegi panjang adalah= " + keliling);
    }
}

class Abstrak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=1; i<=5; i++) {
            for(j=1; j<=10; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        karakter karakter = new karakter(
                "1.Memiliki empat sisi (dimana kedua sisi tersebut saling berhadapan sama panjang dan sejajar)." + "\n" +
                        "2.Memiliki empat sudut siku-siku yang sama besar, yaitu 90 derajat." + "\n" +
                        "3.Memiliki dua diagonal (garis melintang) yang berpotongan menjadi dua bagian yang sama panjang." + "\n" +
                        "4.Memiliki dua sumbu simetri lipat." + "\n" +
                        "5.Memiliki dua sumbu simetri putar." + "\n" +
                        "6.Memiliki sisi-sisi persegi panjang yang saling tegak lurus."
        );

        System.out.println("Sebuah Persegi Panjang");
        System.out.println("======================");


        int panjang, lebar;
        System.out.println("Panjang Persegi Panjang adalah = ");
        panjang = sc.nextInt();
        System.out.println("Lebar Persegi Panjang adalah = ");
        lebar = sc.nextInt();

        Luas luas = new Luas(panjang,lebar);
        Keliling keliling = new Keliling(panjang, lebar);

        karakter.deskripsi();
        System.out.println("======================");
        luas.PPanjang();
        keliling.PPanjang();

    }
}
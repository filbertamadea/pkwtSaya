import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int var, tahun, usia;
        String fname, lname, domisili, sd, smp, sma, univ;
        char lanjut, input;
        do {
            System.out.println("Siapa Nama Depan Anda= ");
            fname=sc.nextLine();
            System.out.println("Siapa Nama Belakang Anda= ");
            lname=sc.nextLine();
            System.out.println("Dimana Domisili anda= ");
            domisili=sc.nextLine();
            System.out.println("Tahun berapa anda lahir? = ");
            tahun=sc.nextInt();
            sc.nextLine();
            System.out.println("Riwayat Pendidikan (SD)= ");
            sd=sc.nextLine();
            System.out.println("Riwayat Pendidikan (SMP)= ");
            smp=sc.nextLine();
            System.out.println("Riwayat Pendidikan (SMA)= ");
            sma=sc.nextLine();
            System.out.println("Riwayat Pendidikan (Kuliah)= ");
            univ=sc.nextLine();
            do{
                System.out.flush();
                System.out.println("Pilih angka = ");
                var=sc.nextInt();
                usia = 2022 - tahun;
                switch (var)
                {
                    case 1:
                        System.out.println("Ini adalah biodata anda");
                        System.out.println("Nama anda adalah : " + fname + " " + lname);
                        System.out.println("Tahun anda lahir adalah : " + tahun);
                        System.out.println("Umur anda adalah : " + usia);
                        System.out.println("Domisili anda adalah : " + domisili);
                        break;
                    case 2:
                        System.out.println("Ini adalah riwayat pendidikan anda");
                        System.out.println("Pendidikan SD anda adalah : " + sd);
                        System.out.println("Pendidikan SMP anda adalah : " + smp);
                        System.out.println("Pendidikan SMA anda adalah : " + sma);
                        System.out.println("Pendidikan KULIAH anda adalah : " + univ);
                        break;
                    default:
                        System.out.println("tidak ada pilihan");
                        break;
                }
                System.out.println("Ingin Mengulang Opsi? (y/n) = ");
                lanjut=sc.next().charAt(0);
                System.out.println();
            }
            while (lanjut == 'y');
            System.out.println("Ingin Mengulang Input? (y/n) = ");
            input=sc.next().charAt(0);
            sc.nextLine();
        }while (input == 'y');

        System.out.println("Sampai Jumpa");

    }
}
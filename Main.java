import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("              APLIKASI TOKO BAN              ");
        System.out.println("---------------------------------------------");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("=============== DAFTAR BAN ================");
        //BAN TIDAK TUBLES
        BanTidakTubles Ttubles1 = new BanTidakTubles(3902, "IRC");
        System.out.println("ID BAN        : " + Ttubles1.id_ban);
        System.out.println("NAMA          : " + Ttubles1.nama);
        System.out.println("STATUS        : " + Ttubles1.jenis());
        System.out.println("DESKRIPSI     : " + Ttubles1.deskripsi());
        System.out.println();

        BanTidakTubles Ttubles2 = new BanTidakTubles(3903, "CORSA");
        System.out.println("ID BAN        : " + Ttubles2.id_ban);
        System.out.println("NAMA          : " + Ttubles2.nama);
        System.out.println("STATUS        : " + Ttubles2.jenis());
        System.out.println("DESKRIPSI     : " + Ttubles2.deskripsi());
        System.out.println();

        //BAN TUBLES
        BanTubles Tubles1 = new BanTubles(3904, "FIRELLI DIABLO");
        System.out.println("ID BAN        : " + Tubles1.id_ban);
        System.out.println("NAMA          : " + Tubles1.nama);
        System.out.println("STATUS        : " + Tubles1.jenis());
        System.out.println("DESKRIPSI     : " + Tubles1.deskripsi());
        System.out.println();

        BanTubles Tubles2 = new BanTubles(3905, "ASPIRA");
        System.out.println("ID BAN        : " + Tubles2.id_ban);
        System.out.println("NAMA          : " + Tubles2.nama);
        System.out.println("STATUS        : " + Tubles2.jenis());
        System.out.println("DESKRIPSI     : " + Tubles2.deskripsi());
        System.out.println();


        System.out.println("Lanjutkan Mengisi Data Ban");
        System.out.println("1. Iya");
        System.out.println("2. Tidak");
        System.out.println("Pilih :  ");
        pilih = input.nextInt();
        if (pilih == 1) {
            Customer cs = new Customer();
            cs.input_data();
            cs.lihat_data();
            Petugas pt = new Petugas();
            pt.input_data();
            pt.update_data();
            TokoBan TokoBan = new TokoBan();
            TokoBan.input_data();
            TokoBan.jenis_service();
            TokoBan.update_data();
        } else if (pilih == 2) {
            System.exit(0);
        } else {
            System.out.println("INVALID !!!");
        }
        System.out.println("========================================================");
        System.out.println("                 MENU BAN                |     HARGA    ");
        System.out.println("--------------------------------------------------------");
        System.out.println("1. IRC                                   |   Rp 280000  ");
        System.out.println("2. CORSA                                 |   Rp 270000  ");
        System.out.println("3. Firelli Diablo                        |   Rp 750000  ");
        System.out.println("4. ASPIRA                                |   Rp 800000  ");
        System.out.println("========================================================");
        System.out.println("Masukan Pilihan Anda = ");
        pilih = input.nextInt();
        System.out.println();
        switch (pilih) {
            case 1 :
                PembayaranService pk = new PembayaranService(280000);
                System.out.println("Total Bayar : " + pk.pembayaran());
                break;
            case 2 :
                PembayaranService pk1 = new PembayaranService(270000);
                System.out.println("Total Bayar : " + pk1.pembayaran());
                break;
            case 3 :
                PembayaranService pk2 = new PembayaranService(750000);
                System.out.println("Total Bayar : " + pk2.pembayaran());
                break;
            case 4 :
                PembayaranService pk3 = new PembayaranService(800000);
                System.out.println("Total Bayar : " + pk3.pembayaran());
                break;
        }

    }
}
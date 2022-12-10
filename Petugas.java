import java.util.Scanner;

public class Petugas {
    int id_Petugas;
    String nama;
    String alamat;
    String nohp;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("           DATA PETUGAS           ");
        System.out.println("----------------------------------");
        System.out.println("Masukan ID Petugas  : ");
        id_Petugas = input.nextInt();
        System.out.println("Masukan Nama        : ");
        nama= input.next();
        System.out.println("Masukan Alamat      : ");
        alamat = input.next();
        System.out.println("Masukkan No Hp      : ");
        nohp = input.next();
    }
    void update_data(){

    }
}

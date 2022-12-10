import java.util.Scanner;
public class Customer {
    int id_customer;
    String nama;
    String no_hp;
    String noken;
    String status;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("          DATA CUSTOMER          ");
        System.out.println("---------------------------------");
        System.out.println("Masukan ID Customer      : ");
        id_customer = input.nextInt();
        System.out.println("Masukan Nama             : ");
        nama = input.next();
        System.out.println("Masukan No HP            : ");
        no_hp = input.next();
        System.out.println("Masukkan No Kendaraan    : ");
        noken = input.next();
        System.out.println("Status Member/non-Member :");
        status = input.next();

    }

    void lihat_data(){

    }
}

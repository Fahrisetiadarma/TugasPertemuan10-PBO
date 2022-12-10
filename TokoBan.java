import java.util.Scanner;

public class TokoBan {
    int id_customer;
    int id_montir;

    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("               DATA SERVICE                 ");
        System.out.println("============================================");
        System.out.println("Masukan ID Customer       : ");
        id_customer = input.nextInt();
        System.out.println("Masukan ID Montir          : ");
        id_montir = input.nextInt();
    }

    void jenis_service(){

    }
    void update_data(){

    }

}
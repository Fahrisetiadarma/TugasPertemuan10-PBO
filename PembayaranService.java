public class PembayaranService extends Pembayaran{
    PembayaranService(int biaya){
        super(biaya);
    }

    @Override
    int pembayaran() {
        return super.getBayarKursus();
    }
}

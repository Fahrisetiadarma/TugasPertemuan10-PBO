abstract public class Pembayaran {
        int biayaservice;

        Pembayaran(int biaya){
            this.biayaservice = biaya;
        }

        public int getBayarKursus(){
            return biayaservice;
        }

        abstract int pembayaran();
    }

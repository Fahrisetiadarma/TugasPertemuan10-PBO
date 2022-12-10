public class BanTidakTubles extends Ban{
        public BanTidakTubles(int id_ban, String nama) {
            super(id_ban, nama);
        }
        @Override
        public String jenis() {
            return "BAN TIDAK TUBLES";
        }
        @Override
        public String deskripsi() {
            return "Ban tidak tubles merupakan ban standar dimana ketika mengalami kebocoran akan cepat habis anginnya";
        }
}


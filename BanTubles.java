public class BanTubles extends Ban{
        public BanTubles(int id_ban, String nama) {
            super(id_ban, nama);
        }
        @Override
        public String jenis() {
            return "BAN SUDAH TUBLES";
        }
        @Override
        public String deskripsi() {
            return "Ban tidak tubles merupakan ban standar dimana ketika mengalami kebocoran tidak akan cepat habis anginnya";
        }
}

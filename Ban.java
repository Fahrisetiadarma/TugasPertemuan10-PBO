public class Ban {
    int id_ban;
    String nama;

    public Ban(int id_ban, String nama) {
        this.id_ban = id_ban;
        this.nama = nama;
    }

    public String jenis(){
        return "Jenis Ban";
    }
    public String deskripsi() {
        return "Jenis Ban Mempengaruhi Umur dan Performa";
    }
}

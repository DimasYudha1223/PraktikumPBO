public class Kendaraan {
    String kategori;
    String KT;
    double waktu_masuk ;
    double waktu_keluar;

    public Kendaraan(String kategori, String KT, double waktu_masuk, double waktu_keluar){
        this.kategori = kategori;
        this.KT = KT;
        this.waktu_masuk = waktu_masuk;
        this.waktu_keluar = waktu_keluar;
    }
    public void registrasi(){
        System.out.println("Jenis Kendaraan, " + this.kategori);
        System.out.println("KT Kendaraan " + this.KT);
        System.out.println("Waktu Masuk Kendaraan " + this.waktu_masuk);
        System.out.println("Kendaraan Telah Terdaftar");
    }
    public void update(){
        System.out.println("Jenis Kendaraan, " + this.kategori);
        System.out.println("KT Kendaraan " + this.KT);
        System.out.println("Waktu Masuk Kendaraan " + this.waktu_masuk);
        System.out.println("Waktu Keluar Kendaraan " + this.waktu_keluar);
        System.out.println("Data kendaraan Telah Terupdate");
    }
}
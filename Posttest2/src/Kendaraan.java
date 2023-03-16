public class Kendaraan {
    private String kategori;
    private String KT;
    private double waktu_masuk ;
    private double waktu_keluar;

    public Kendaraan(String kategori, String KT, double waktu_masuk, double waktu_keluar){
        this.setKategori(kategori);
        this.setKT(KT);
        this.setWaktu_masuk(waktu_masuk);
        this.setWaktu_keluar(waktu_keluar);
    }
    public void registrasi(){
        System.out.println("Jenis Kendaraan, " + this.getKategori());
        System.out.println("KT Kendaraan " + this.getKT());
        System.out.println("Waktu Masuk Kendaraan " + this.getWaktu_masuk());
        System.out.println("Kendaraan Telah Terdaftar");
    }
    public void update(){
        System.out.println("Jenis Kendaraan, " + this.getKategori());
        System.out.println("KT Kendaraan " + this.getKT());
        System.out.println("Waktu Masuk Kendaraan " + this.getWaktu_masuk());
        System.out.println("Waktu Keluar Kendaraan " + this.getWaktu_keluar());
        System.out.println("Data kendaraan Telah Terupdate");
    }

    //Setter dan getter
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKT() {
        return KT;
    }

    public void setKT(String KT) {
        this.KT = KT;
    }

    public double getWaktu_masuk() {
        return waktu_masuk;
    }

    public void setWaktu_masuk(double waktu_masuk) {
        this.waktu_masuk = waktu_masuk;
    }

    public double getWaktu_keluar() {
        return waktu_keluar;
    }

    public void setWaktu_keluar(double waktu_keluar) {
        this.waktu_keluar = waktu_keluar;
    }
}
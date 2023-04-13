public abstract class Kendaraan implements int_kendaraan {
    private String kategori;
    private String KT;
    private double waktu_masuk;
    private double waktu_keluar;

    public abstract void add();

    public Kendaraan(String kategori, String KT, double waktu_masuk, double waktu_keluar) {
        this.kategori = kategori;
        this.KT = KT;
        this.waktu_masuk = waktu_masuk;
        this.waktu_keluar = waktu_keluar;
    }

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

    abstract void OverRide();

}
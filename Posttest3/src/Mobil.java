public class Mobil extends Kendaraan{
    private String merk;

    public Mobil(String kategori, String KT, double waktu_masuk, double waktu_keluar, String merk) {
        super(kategori,
                KT,
                waktu_masuk,
                waktu_keluar);

        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

}

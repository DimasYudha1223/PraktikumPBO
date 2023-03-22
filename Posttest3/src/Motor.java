public class Motor extends Kendaraan {

    private int ukuran_mesin;

    public Motor(String kategori, String KT, double waktu_masuk, double waktu_keluar, int ukuran_mesin) {
        super(kategori,
                KT,
                waktu_masuk,
                waktu_keluar);

        this.ukuran_mesin = ukuran_mesin;
    }
    public int getUkuran_mesin() {
        return ukuran_mesin;
    }

    public void setUkuran_mesin(int ukuran_mesin) {
        this.ukuran_mesin = ukuran_mesin;
    }

}

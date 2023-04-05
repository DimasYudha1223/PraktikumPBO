public class Motor extends Kendaraan {

    protected final int ukuran_mesin;

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

    @Override
    public void OverRide() {
        System.out.println("Dosen baru dengan nama " + this.getKategori());
        System.out.println("Ukuran Mesin " + this.ukuran_mesin);
        System.out.println("Berhasil Ditambahkan");

    }
}

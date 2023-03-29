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

    //Overload
    public void add(){
        System.out.println("Data baru telah ditambah");
    }

    public void add(String merk){
        System.out.println("Anda baru menambahkan "+merk+ " data");
    }


    @Override
    public void OverRide() {
        System.out.println("Kategori Kendaraan Baru " + this.getKategori());
        System.out.println("Merk Kendaraan " + this.merk);
        System.out.println("Berhasil Ditambahkan");
    }

}

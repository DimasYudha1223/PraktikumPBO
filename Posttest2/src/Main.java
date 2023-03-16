
import java.util.*;
import java.io.*;


public class Main {

    static ArrayList<Kendaraan> kendaraan = new ArrayList<>();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Lgi buat login msi bingung bang jdi lewat dulu
//    static Scanner input = new Scanner(System.in);
//    public static void main() { menuLogin(); }
//
//    static void menuLogin() {
//        System.out.println("==== Sistem Pendataan Parkir ====");
//        System.out.println("1. Login");
//        System.out.println("2. Keluar");
//        System.out.print("Pilih menu (1/2): ");
//        int pilihan = input.nextInt();
//        switch (pilihan) {
//            case 1:
//                loginAdmin();
//                break;
//            case 2:
//                System.out.println("Terima Kasih");
//                System.exit(0);
//            default:
//                System.out.println("Pilihan tidak valid!");
//                menuLogin();
//        }
//    }
//
//    static void loginAdmin() {
//        System.out.println("\n== Login Admin ==");
//        System.out.print("Masukkan password: ");
//        String password = input.next();
//        if (password.equals("123")) {
//            main();
//        } else {
//            System.out.println("Password salah!");
//            loginAdmin();
//        }
//    }

    public static void main(String[] args) throws IOException {


        while (true) {
            System.out.println(" Sistem Parkir Mall GD ");
            System.out.println("1. Tambah Data Kendaraan");
            System.out.println("2. Lihat Data Kendaraan");
            System.out.println("3. Ubah Data Kendaraan");
            System.out.println("4. Hapus Data Kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            if (pilihan == 1) {
                tambahKdr();
            } else if (pilihan == 2){
                lihatKdr();
            } else if (pilihan == 3){
                ubahKdr();
            } else if (pilihan == 4){
                hapusKdr();
            } else if (pilihan == 5){
                System.exit(0);
            } else {
                System.out.println("Pilihan Salah");
            }
        }

    }

    public static void tambahKdr() throws IOException{
        System.out.print("Masukan Jenis Kendaraan: ");
        String addkategori = br.readLine();
        System.out.print("Masukan KT Kendaraan: ");
        String addKT = br.readLine();
        System.out.print("Masukan Waktu Masuk Kendaraan: ");
        double addwaktu_masuk = Double.parseDouble(br.readLine());
        System.out.print("Masukan Waktu Keluar Kendaraan: ");
        double addwaktu_keluar = Double.parseDouble(br.readLine());
        Kendaraan kdrBaru = new Kendaraan(addkategori, addKT, addwaktu_masuk, addwaktu_keluar);
        kendaraan.add(kdrBaru);
        kdrBaru.registrasi();
    }

    public static void lihatKdr() {
        System.out.println(" ==== Data Kendaraan ====");
        for (int i = 0; i < kendaraan.size(); i++) {
            System.out.println("Kendaraan ke-" + (i+1));
            System.out.println("Jenis Kendaraan: " + kendaraan.get(i).getKategori());
            System.out.println("KT Kendaraan: " + kendaraan.get(i).getKT());
            System.out.println("Waktu Masuk Kendaraan: " + kendaraan.get(i).getWaktu_masuk());
            System.out.println("Waktu Keluar Kendaraan: " + kendaraan.get(i).getWaktu_keluar());
            System.out.print("\n");
        }
    }

    public static void ubahKdr() throws IOException{

        lihatKdr();

        System.out.println(" ==== Ubah Data Kendaraan ====");
        System.out.print("Masukan Data Kendaraan ke-");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Masukan Kategori Kendaraan: ");
        String setKTG = br.readLine();
        System.out.print("Masukan KT Kendaraan: ");
        String setKTKdr = br.readLine();
        System.out.print("Masukan Waktu Masuk Kendaraan: ");
        double setWKTMSK = Double.parseDouble(br.readLine());
        System.out.print("Masukan Waktu Keluar Kendaraan: ");
        double setWKTKLR = Double.parseDouble(br.readLine());

        // memasukan data yang baru ke array list (menggantikannya)
        kendaraan.get(index - 1).setKategori(setKTG);
        kendaraan.get(index - 1).setKT(setKTKdr);
        kendaraan.get(index - 1).setWaktu_masuk(setWKTMSK);
        kendaraan.get(index - 1).setWaktu_keluar(setWKTKLR);

        ///pemanggilan method terupdate
        kendaraan.get(index-1).update();
    }

    public static void hapusKdr() throws IOException{
        lihatKdr();
        System.out.println(" ==== Hapus Data Kendaraan ====");
        System.out.print("Masukan Data Kendaraan ke-");
        int index = Integer.parseInt(br.readLine());
        kendaraan.remove(index-1);
    }
}

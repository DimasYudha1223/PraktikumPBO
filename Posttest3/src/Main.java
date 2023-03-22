
import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Mobil> mobil = new ArrayList<>();
    static ArrayList<Motor> motor = new ArrayList<>();

    /*
 Lgi buat login msi bingung bang jdi lewat dulu
    static Scanner input = new Scanner(System.in);
    public static void main() { menuLogin(); }

    static void menuLogin() {
        System.out.println("==== Sistem Pendataan Parkir ====");
        System.out.println("1. Login");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu (1/2): ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                loginAdmin();
                break;
            case 2:
                System.out.println("Terima Kasih");
                System.exit(0);
            default:
                System.out.println("Pilihan tidak valid!");
                menuLogin();
        }
    }

    static void loginAdmin() {
        System.out.println("\n== Login Admin ==");
        System.out.print("Masukkan password: ");
        String password = input.next();
        if (password.equals("123")) {
            main();
        } else {
            System.out.println("Password salah!");
            loginAdmin();
        }
    }
*/


    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Sistem Parkir Mall GD");
            System.out.println("1. Tambah Data Kendaraan");
            System.out.println("2. Lihat Data Kendaraan");
            System.out.println("3. Ubah Data Kendaraan");
            System.out.println("4. Hapus Data Kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan Anda :");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    tambahKdr();
                    break;
                case 2:
                    lihatKdr();
                    break;
                case 3:
                    ubahKdr();
                    break;
                case 4:
                    hapusKdr();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Salah");
                    break;
            }
        }
    }

    public static void tambahKdr() throws IOException{
        System.out.println("Tambah Data");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukan Jenis Kendaraan: ");
                String addkategori = br.readLine();
                System.out.print("Masukan KT Kendaraan: ");
                String addKT = br.readLine();
                System.out.print("Masukan Waktu Masuk Kendaraan: ");
                double addwaktu_masuk = Double.parseDouble(br.readLine());
                System.out.print("Masukan Waktu Keluar Kendaraan: ");
                double addwaktu_keluar = Double.parseDouble(br.readLine());
                System.out.print("Masukan Merk Kendaraan: ");
                String addmerk = br.readLine();
                Mobil mblBaru = new Mobil(addkategori, addKT, addwaktu_masuk, addwaktu_keluar, addmerk);
                mobil.add(mblBaru);
                break;
            case 2:
                System.out.print("Masukan Jenis Kendaraan: ");
                String addkategori2 = br.readLine();
                System.out.print("Masukan KT Kendaraan: ");
                String addKT2 = br.readLine();
                System.out.print("Masukan Waktu Masuk Kendaraan: ");
                double addwaktu_masuk2 = Double.parseDouble(br.readLine());
                System.out.print("Masukan Waktu Keluar Kendaraan: ");
                double addwaktu_keluar2 = Double.parseDouble(br.readLine());
                System.out.print("Masukan Ukuran Cilinder Kendaraan: ");
                int addukuran_mesin2 = Integer.parseInt(br.readLine());
                Motor mtrBaru = new Motor(addkategori2, addKT2, addwaktu_masuk2, addwaktu_keluar2, addukuran_mesin2);
                motor.add(mtrBaru);
                break;
            default:
                System.out.println("Pilihan Salah");
                break;
        }

    }
    public static void lihatKdr() throws IOException{
        System.out.println("Tambah Data Kendaraan");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.println(" Data Mobil");
                for (Mobil value : mobil) {
                    System.out.println("Jenis Kendaraan: " + value.getKategori());
                    System.out.println("KT Kendaraan: " + value.getKT());
                    System.out.println("Waktu Masuk Kendaraan: " + value.getWaktu_masuk());
                    System.out.println("Waktu Keluar Kendaraan: " + value.getWaktu_keluar());
                    System.out.println("Merk Mobil: " + value.getMerk());
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println(" Data Motor");
                for (int i = 0; i < motor.size(); i++) {
                    System.out.println("Motor ke-" + (i+1));
                    System.out.println("Jenis Kendaraan: " + motor.get(i).getKategori());
                    System.out.println("KT Kendaraan: " + motor.get(i).getKT());
                    System.out.println("Waktu Masuk Kendaraan: " + motor.get(i).getWaktu_masuk());
                    System.out.println("Waktu Keluar Kendaraan: " + motor.get(i).getWaktu_keluar());
                    System.out.println("Ukuran Silinder Motor: " + motor.get(i).getUkuran_mesin());
                    System.out.println("\n");
                }
                break;
            default:
                System.out.println("Pilihan Salah");
                break;
        }
    }

    public static void ubahKdr() throws IOException {
        System.out.println("Tambah Data Kendaraan");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukan Pilihan Anda : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Data Mobil: ");
                int mbl = Integer.parseInt(br.readLine());

            {
                System.out.print("Masukan Jenis Kendaraan: ");
                String addkategori = br.readLine();
                System.out.print("Masukan KT Kendaraan: ");
                String addKT = br.readLine();
                System.out.print("Masukan Waktu Masuk Kendaraan: ");
                double addwaktu_masuk = Double.parseDouble(br.readLine());
                System.out.print("Masukan Waktu Keluar Kendaraan: ");
                double addwaktu_keluar = Double.parseDouble(br.readLine());
                System.out.print("Masukan Merk Kendaraan: ");
                String addmerk = br.readLine();
                mobil.get(mbl-1).setKategori(addkategori);
                mobil.get(mbl-1).setKT(addKT);
                mobil.get(mbl-1).setWaktu_masuk(addwaktu_masuk);
                mobil.get(mbl-1).setWaktu_keluar(addwaktu_keluar);
                mobil.get(mbl-1).setMerk(addmerk);
                System.out.println("Data Diubah");
            }
                break;
            case 2:
                System.out.print("Masukkan Data Motor: ");
                int mtr = Integer.parseInt(br.readLine());

                System.out.print("Masukan Jenis Kendaraan: ");
                String addkategori = br.readLine();
                System.out.print("Masukan KT Kendaraan: ");
                String addKT = br.readLine();
                System.out.print("Masukan Waktu Masuk Kendaraan: ");
                double addwaktu_masuk = Double.parseDouble(br.readLine());
                System.out.print("Masukan Waktu Keluar Kendaraan: ");
                double addwaktu_keluar = Double.parseDouble(br.readLine());
                System.out.print("Masukan Merk Kendaraan: ");
                String addukuran_mesin = br.readLine();
                motor.get(mtr-1).setKategori(addkategori);
                motor.get(mtr-1).setKT(addKT);
                motor.get(mtr-1).setWaktu_masuk(addwaktu_masuk);
                motor.get(mtr-1).setWaktu_keluar(addwaktu_keluar);
                motor.get(mtr-1).setUkuran_mesin(Integer.parseInt(addukuran_mesin));
                System.out.println("Data Diubah");
                break;
            default:
                break;
        }

    }

    public static void hapusKdr() throws IOException {
        System.out.println("Nambah data");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Data Mobil: ");
                int mbl = Integer.parseInt(br.readLine());

                mobil.remove(mbl - 1);

                System.out.println("Data Dihapus");
                break;
            case 2:
                System.out.print("Masukkan Data Motor: ");
                int mtr = Integer.parseInt(br.readLine());

                motor.remove(mtr - 1);

                System.out.println("Data Dihapus");
                break;
            default:
                break;
        }

    }
}


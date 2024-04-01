import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Barang> dataBarang = new ArrayList<>();
    static ArrayList<RT> databarangrt = new ArrayList<>();
    static ArrayList<NonRT> databarangnonrt = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                        Pendataan Barang Elektronik Toko Cestrin
                        1. Tambah Data
                        2. Lihat Data
                        3. Ubah Data
                        4. Hapus Data
                        0. Exit
                    """);
            System.out.print("Masukkan Pilihan : ");
            String menu = scanner.nextLine();
            System.out.println("======================");

            if (menu.equals("1")) {
                tambahbarang();
            } else if (menu.equals("2")) {
                lihatdata();
            } else if (menu.equals("3")) {
                ubahdata();
            } else if (menu.equals("4")) {
                hapusdata();
            } else if (menu.equals("0")) {
                break;
            } else {
                System.out.println("Input Salah!!");
            }
        }
    }

    public static void tambahbarang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu tambah data barang");
        System.out.println(" 1. Tambah barang elektronik rumah tangga");
        System.out.println(" 2. Tambah barang elektronik non rumah tangga");
        System.out.print("Masukkan pilihan anda : ");
        String pilih = scanner.nextLine();
        if (pilih.equals("1")) {
            System.out.print("Masukkan Nama Barang RT      : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Harga Barang RT     : ");
            int harga = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Deskripsi Barang RT : ");
            String deskripsi = scanner.nextLine();
            System.out.print("Masukkan Merek Barang RT     : ");
            String merek = scanner.nextLine();

            RT barangRTBaru = new RT(nama, harga, deskripsi, merek);
            databarangrt.add(barangRTBaru);
        } else if (pilih.equals("2")) {
            System.out.print("Masukkan Nama Barang NonRT      : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Harga Barang NonRT     : ");
            int harga = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Deskripsi Barang NonRT : ");
            String deskripsi = scanner.nextLine();
            System.out.print("Masukkan stok Barang NonRT      : ");
            int stok = scanner.nextInt();

            NonRT barangNonRTBaru = new NonRT(nama, harga, deskripsi, stok);
            databarangnonrt.add(barangNonRTBaru);
        }
    }

    public static void lihatdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lihat Data");
        System.out.println("1. Lihat Barang Elektronik Rumah Tangga");
        System.out.println("2. Lihat Barang Elektronik Non Rumah Tangga");
        System.out.print("Masukkan Pilihan: ");
        String pilih = sc.nextLine();
        System.out.println("===========================");

        if (pilih.equals("1")) {
            System.out.println("Data Barang Elektronik Rumah Tangga");
            if (databarangrt.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < databarangrt.size(); i++) {
                    System.out.println("Barang ke-" + (i + 1));
                    System.out.println("Nama      : " + databarangrt.get(i).getNama());
                    System.out.println("Harga     : " + databarangrt.get(i).getHarga());
                    System.out.println("Deskripsi : " + databarangrt.get(i).getDeskripsi());
                    System.out.println("Merek     : " + databarangrt.get(i).getMerek());
                    System.out.println("===========================");
                }
            }
        } else if (pilih.equals("2")) {
            System.out.println("Data Barang Elektronik Non Rumah Tangga");
            if (databarangnonrt.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < databarangnonrt.size(); i++) {
                    System.out.println("Barang ke-" + (i + 1));
                    System.out.println("Nama      : " + databarangnonrt.get(i).getNama());
                    System.out.println("Harga     : " + databarangnonrt.get(i).getHarga());
                    System.out.println("Deskripsi : " + databarangnonrt.get(i).getDeskripsi());
                    System.out.println("stok      : " + databarangnonrt.get(i).getstok());
                    System.out.println("===========================");
                }
            }
        } else {
            System.out.println("Input Salah!!");
        }
    }

    public static void ubahdata() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ubah Data");
        System.out.println("1. Ubah Data Barang Elektronik Rumah Tangga");
        System.out.println("2. Ubah Data Barang Elektronik Non Rumah Tangga");
        System.out.print("Masukkan Pilihan: ");
        String pilih = scanner.nextLine();
        System.out.println("===========================");

        if (pilih.equals("1")) {
            System.out.println("Data Barang Elektronik Rumah Tangga");
            if (databarangrt.size() < 1) {
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < databarangrt.size(); i++) {
                    System.out.println("Barang ke-" + (i + 1));
                    System.out.println("Nama      : " + databarangrt.get(i).getNama());
                    System.out.println("Harga     : " + databarangrt.get(i).getHarga());
                    System.out.println("Deskripsi : " + databarangrt.get(i).getDeskripsi());
                    System.out.println("Merek     : " + databarangrt.get(i).getMerek());
                    System.out.println("===========================");
                }
                System.out.print("Pilih nomor barang yang akan diubah: ");
                int ubah = scanner.nextInt();
                scanner.nextLine(); // Membuang newline
                System.out.print("Masukkan nama baru      : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan harga baru     : ");
                int harga = scanner.nextInt();
                scanner.nextLine(); // Membuang newline
                System.out.print("Masukkan deskripsi baru : ");
                String deskripsi = scanner.nextLine();
                System.out.print("Masukkan merek baru     : ");
                String merek = scanner.nextLine();

                RT barangRT = databarangrt.get(ubah - 1);
                barangRT.setNama(nama);
                barangRT.setHarga(harga);
                barangRT.setDeskripsi(deskripsi);
                barangRT.setMerek(merek);
                System.out.println("Data berhasil diubah!");
            }
        } else if (pilih.equals("2")) {
            System.out.println("Data Barang Elektronik Non Rumah Tangga");
            if (databarangnonrt.size() < 1) {
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < databarangnonrt.size(); i++) {
                    System.out.println("Barang ke-" + (i + 1));
                    System.out.println("Nama      : " + databarangnonrt.get(i).getNama());
                    System.out.println("Harga     : " + databarangnonrt.get(i).getHarga());
                    System.out.println("Deskripsi : " + databarangnonrt.get(i).getDeskripsi());
                    System.out.println("stok      : " + databarangnonrt.get(i).getstok());
                    System.out.println("===========================");
                }
                System.out.print("Pilih nomor barang yang akan diubah : ");
                int ubah = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan nama baru      : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan harga baru     : ");
                int harga = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan deskripsi baru : ");
                String deskripsi = scanner.nextLine();
                System.out.print("Masukkan stok  baru     : ");
                int stok = scanner.nextInt();

                NonRT barangNonRT = databarangnonrt.get(ubah - 1);
                barangNonRT.setNama(nama);
                barangNonRT.setHarga(harga);
                barangNonRT.setDeskripsi(deskripsi);
                barangNonRT.setstok(stok);
                System.out.println("Data berhasil diubah!");
            }
        } else {
            System.out.println("Input Salah!!");
        }
    }

    public static void hapusdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hapus Data");
        System.out.println("1. Hapus Barang Elektronik Rumah Tangga");
        System.out.println("2. Hapus Barang Elektronik Non Rumah Tangga");
        System.out.print("Masukkan Pilihan: ");
        String pilih = scanner.nextLine();
        System.out.println("======================");

        if (pilih.equals("1")) {
            System.out.println("Data Barang Elektronik Rumah Tangga");
            if (databarangrt.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < databarangrt.size(); i++) {
                    System.out.println("Barang ke-" + (i + 1));
                    System.out.println("Nama      : " + databarangrt.get(i).getNama());
                    System.out.println("Harga     : " + databarangrt.get(i).getHarga());
                    System.out.println("Deskripsi : " + databarangrt.get(i).getDeskripsi());
                    System.out.println("Merek     : " + databarangrt.get(i).getMerek());
                    System.out.println("===========================");
                }
                System.out.print("Pilih nomor barang yang akan dihapus : ");
                int hapus = scanner.nextInt();
                databarangrt.remove(hapus - 1);
                System.out.println("Barang berhasil dihapus!");
            }
        } else if (pilih.equals("2")) {
            System.out.println("Data Barang Elektronik Non Rumah Tangga");
            if (databarangnonrt.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < databarangnonrt.size(); i++) {
                    System.out.println("Barang ke-" + (i + 1));
                    System.out.println("Nama      : " + databarangnonrt.get(i).getNama());
                    System.out.println("Harga     : " + databarangnonrt.get(i).getHarga());
                    System.out.println("Deskripsi : " + databarangnonrt.get(i).getDeskripsi());
                    System.out.println("Stok      : " + databarangnonrt.get(i).getstok());
                    System.out.println("===========================");
                }
                System.out.print("Pilih nomor barang yang akan dihapus : ");
                int hapus = scanner.nextInt();
                databarangnonrt.remove(hapus - 1);
                System.out.println("Barang berhasil dihapus!");
            }
        } else {
            System.out.println("Input Salah!!");
        }
    }
}

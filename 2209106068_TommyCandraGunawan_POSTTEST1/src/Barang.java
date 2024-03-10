public class Barang {
    String nama, deskripsi;
    int harga;

    public Barang(String nama, int harga, String deskripsi){
        this.nama = nama;
        this.harga = harga;
        this.deskripsi= deskripsi;
    }
    void tampil() {
        System.out.println("nama: " + this.nama);
        System.out.println("harga: " + this.harga);
        System.out.println("Deskripsi: " + this.deskripsi);
    }
}

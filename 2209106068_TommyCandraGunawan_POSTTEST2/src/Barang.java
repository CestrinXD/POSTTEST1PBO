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
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}


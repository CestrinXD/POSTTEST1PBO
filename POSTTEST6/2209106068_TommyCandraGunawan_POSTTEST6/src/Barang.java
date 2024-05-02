
public abstract class Barang implements displayable{
    protected String nama;
    protected int harga;
    protected String deskripsi;

    public Barang(String nama, int harga, String deskripsi) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        
    }

    // Metode abstrak yang diimplementasikan oleh kelas turunan
    public abstract void tampil();

    public void displayInfo() {
        System.out.println("Nama      : " + nama);
        System.out.println("Harga     : " + harga);
        System.out.println("Deskripsi : " + deskripsi);
    }

    public String getDescription() {
        return deskripsi;
    }

    // Getter dan setter untuk atributnyaaaa
    public int getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
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
}

public class RT extends Barang {
    private String merek;

    public RT(String nama, int harga, String deskripsi, String merek) {
        super(nama, harga, deskripsi);
        this.merek = merek;
    }

    @Override
    public void tampil() {
        System.out.println("Nama      : " + nama);
        System.out.println("Harga     : " + harga);
        System.out.println("Deskripsi : " + deskripsi);
        System.out.println("Merek     : " + merek);
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
}

public class RT extends Barang {
    private String merek;

    public RT(String nama, int harga, String deskripsi, String merek) {
        super(nama, harga, deskripsi);
        this.merek = merek;
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Merek: " + this.merek);
    }

    public String getMerek(){
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
}
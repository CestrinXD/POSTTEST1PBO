public class NonRT extends Barang {
    int stok;

    public NonRT(String nama, int harga, String deskripsi, int stok) {
        super(nama, harga, deskripsi);
        this.stok = stok;
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Stok: " + this.stok);
    }

    void tampil(boolean withoutStock) {
        if (withoutStock) {
            super.tampil();
        } else {
            tampil();
        }
    }

    public int getstok() {
        return stok;
    }

    public void setstok(int stok) {
        this.stok = stok;
    }
}
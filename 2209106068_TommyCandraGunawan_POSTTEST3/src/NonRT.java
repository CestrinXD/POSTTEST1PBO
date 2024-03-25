public class NonRT extends Barang {
    int stok;

    public NonRT(String nama, int harga, String deskripsi, int stok){
        super(nama, harga, deskripsi);
        this.stok = stok;
    }

    public int getstok(){
        return stok;
    }
    public void setstok(int stok) {
        this.stok = stok;
    }
}
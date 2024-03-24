public class NonRT extends Barang {
    String brand;

    public NonRT(String nama, int harga, String deskripsi, String brand){
        super(nama, harga, deskripsi);
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
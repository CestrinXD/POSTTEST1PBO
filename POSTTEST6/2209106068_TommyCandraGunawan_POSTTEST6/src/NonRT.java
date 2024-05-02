    public class NonRT extends Barang {
        private int stok;
    
        public NonRT(String nama, int harga, String deskripsi, int stok) {
            super(nama, harga, deskripsi);
            this.stok = stok;
        }
    
        @Override
        public void tampil() {
            System.out.println("Nama      : " + getNama());
            System.out.println("Harga     : " + getHarga());
            System.out.println("Deskripsi : " + getDeskripsi());
            System.out.println("Stok      : " + getStok());
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Stok      : " + stok);
        }
    
        @Override
        public String getDescription() {
            return super.getDescription() + " (Stok: " + stok + ")";
        }
    
        public int getStok() {
            return stok;
        }
    
        public void setStok(int stok) {
            this.stok = stok;
        }
    }
    
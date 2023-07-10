// Class Motor sebagai superclass
public abstract class Motor {
    protected String merk;
    protected int tahunProduksi;

    public Motor(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    // getter 
    public String getMerk() {
        return merk;
    }
    // setter
    public void setMerk(String merk) {
        this.merk = merk;
    }
    // getter
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public abstract void info();
}

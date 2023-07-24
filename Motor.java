// Class Motor sebagai superclass
public abstract class Motor { //abstract kelas yang tidak dapat diinstansiasi langsung,
    protected String merk;
    protected int tahunProduksi;

    public Motor(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    public Motor() {
        this.merk = null;
        this.tahunProduksi = 0;
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

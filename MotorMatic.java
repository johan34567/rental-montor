// Class MotorMatic sebagai subclass dari Motor
public class MotorMatic extends Motor {
    private boolean transmisiOtomatis;
       

    public MotorMatic(String merk, int tahunProduksi, boolean transmisiOtomatis) {
        super(merk, tahunProduksi);
        this.transmisiOtomatis = transmisiOtomatis;
    } //  konstruktor ini memanggil konstruktor dari superclass menggunakan pernyataan super(merk, tahunProduksi).Pernyataan ini digunakan untuk memanggil konstruktor dari superclass yang memiliki parameter yang sesuai dengan tipe data dan urutan yang sama
    
    public boolean isTransmisiOtomatis() {
        return transmisiOtomatis;
    }

    public void setTransmisiOtomatis(boolean transmisiOtomatis) {
        this.transmisiOtomatis = transmisiOtomatis;
    }

    @Override // overriding metod sama isinya beda
    public void info() { // termasuk polimorfisem
        System.out.println("Motor Matic");
        System.out.println("Transmisi Otomatis: " + (transmisiOtomatis ? "Ya" : "Tidak"));
    }
}

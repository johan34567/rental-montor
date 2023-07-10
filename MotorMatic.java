// Class MotorMatic sebagai subclass dari Motor
public class MotorMatic extends Motor {
    private boolean transmisiOtomatis;

    public MotorMatic(String merk, int tahunProduksi, boolean transmisiOtomatis) {
        super(merk, tahunProduksi);
        this.transmisiOtomatis = transmisiOtomatis;
    }

    public boolean isTransmisiOtomatis() {
        return transmisiOtomatis;
    }

    public void setTransmisiOtomatis(boolean transmisiOtomatis) {
        this.transmisiOtomatis = transmisiOtomatis;
    }

    @Override
    public void info() { // termasuk polimorfisem
        System.out.println("Motor Matic");
        System.out.println("Transmisi Otomatis: " + (transmisiOtomatis ? "Ya" : "Tidak"));
    }
}

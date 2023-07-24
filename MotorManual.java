// Class MotorManual sebagai subclass dari Motor
public class MotorManual extends Motor {
    private int kapasitasTangki;
    
    public MotorManual(String merk, int tahunProduksi, int kapasitasTangki) {
        super(merk, tahunProduksi);
        this.kapasitasTangki = kapasitasTangki;
    }
     public MotorManual() {
        this.merk = "ducati";
        this.tahunProduksi = 2004;
        this.kapasitasTangki = 20;

    }

    public String toString(){
        return "merk: "+merk+
        "\ntahun produksi: "+tahunProduksi+
        "\nkapasitas tangki: "+kapasitasTangki;
    } //revisi

    // getter
    public int getKapasitasTangki() {
        return kapasitasTangki;
    }
    // setter
    public void setKapasitasTangki(int kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    @Override // overriding 
    public void info() { // termasuk polimorfisem
        System.out.println("Motor Manual");
        System.out.println("Kapasitas Tangki: " + kapasitasTangki + " liter");
    }
}

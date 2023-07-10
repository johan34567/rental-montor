import java.util.ArrayList;
import java.util.List;

// Class RentalMotor untuk mengatur penyewaan sepeda motor
public class RentalMontor {
    private List<Motor> motorList;

    public RentalMontor() {
        motorList = new ArrayList<>();
    }

    public void tambahMotor(Motor motor) {
        motorList.add(motor);
        System.out.println("Motor berhasil ditambahkan.");
    }

    public void tampilkanMotor() {
        if (motorList.isEmpty()) {
            System.out.println("Tidak ada motor yang tersedia.");
        } else {
            System.out.println("Daftar Motor:");
            for (int i = 0; i < motorList.size(); i++) {
                System.out.println("Motor " + (i + 1));
                motorList.get(i).info();
                System.out.println();
            }
        }
    }

    public void hapusMotor(int index) {
        if (index >= 0 && index < motorList.size()) {
            motorList.remove(index);
            System.out.println("Motor berhasil dihapus.");
        } else {
            System.out.println("Indeks motor tidak valid.");
        }
    }
}

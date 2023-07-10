import java.util.Scanner;

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        RentalMontor rentalMotor = new RentalMontor();
        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Tampilkan Motor");
            System.out.println("3. Hapus Motor");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    // Tambah Motor
                    System.out.println("Tambah Motor");
                    System.out.print("Merk: ");
                    String merk = scanner.next();
                    System.out.print("Tahun Produksi: ");
                    int tahunProduksi = scanner.nextInt();
                    System.out.print("Jenis Motor (1. Manual, 2. Matic): ");
                    int jenisMotor = scanner.nextInt();

                    Motor motor;
                    if (jenisMotor == 1) {
                        System.out.print("Kapasitas Tangki: ");
                        int kapasitasTangki = scanner.nextInt();
                        motor = new MotorManual(merk, tahunProduksi, kapasitasTangki);
                    } else if (jenisMotor == 2) {
                        System.out.print("Transmisi Otomatis (true/false): ");
                        boolean transmisiOtomatis = scanner.nextBoolean();
                        motor = new MotorMatic(merk, tahunProduksi, transmisiOtomatis);
                    } else {
                        System.out.println("Jenis motor tidak valid.");
                        continue;
                    }

                    rentalMotor.tambahMotor(motor);
                    break;

                case 2:
                    // Tampilkan Motor
                    rentalMotor.tampilkanMotor();
                    break;

                case 3:
                    // Hapus Motor
                    System.out.print("Indeks motor yang akan dihapus: ");
                    int index = scanner.nextInt();
                    rentalMotor.hapusMotor(index - 1);
                    break;

                case 0:
                    // Keluar
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
            System.out.println();
        } while (menu != 0);
    }
}

import java.util.Scanner;

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        RentalMontor rentalMotor = new RentalMontor();
        Scanner scanner = new Scanner(System.in);
        MotorManual motorManual = new MotorManual();
        motorManual.setMerk("ducati");
        System.out.println(motorManual.getMerk());

        int menu; // untuk memilih opsi menu melalui inputan angka
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Tampilkan Motor");
            System.out.println("3. Hapus Motor");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = scanner.nextInt();

            switch (menu) { // untuk menambahkan montor,merk,tahun produksi,dan jenis montor
                case 1:
                    // Tambah Motor
                    System.out.println("Tambah Motor");
                    System.out.print("Merk: ");
                    String merk = scanner.next();
                    System.out.print("Tahun Produksi: ");
                    int tahunProduksi = scanner.nextInt();
                    System.out.print("Jenis Motor (1. Manual, 2. Matic): ");
                    int jenisMotor = scanner.nextInt();

                    Motor motor; //untuk membuat objek dari kelas Motor berdasarkan jenis motor yang diberikan.
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
                    break; // "break" untuk menghentikan eksekusi lebih lanjut.

                case 2:
                    // tampilkan montor
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
        } while (menu != 0); //-while" untuk mengulang eksekusi blok kode
    }
}
// protected keyword adalah jenis aksesibilitas yang mengatur akses ke anggota kelas (seperti variabel atau metode) dalam sebuah hierarki pewarisan (inheritance). 
// Konsep ini terutama digunakan dalam bahasa pemrograman berorientasi objek, di mana kelas dapat mewarisi sifat dan perilaku dari kelas lain (kelas induk atau superclass).

// Abstract method adalah metode dalam bahasa pemrograman yang tidak memiliki implementasi langsung di dalam kelas di mana metode tersebut dideklarasikan. 
// Metode abstrak ditandai dengan kata kunci "abstract" di depan deklarasinya dan tidak diikuti oleh tubuh metode (kode implementasi). Sebaliknya, metode abstrak hanya 
// memiliki tanda tangan metode yang terdiri dari nama metode, tipe kembalian (jika ada), dan daftar parameter.
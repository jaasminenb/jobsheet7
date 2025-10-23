import java.util.Scanner;
public class Tugas1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlahTiket = -1; 
        long totalTiketTerjual = 0;
        double totalPenjualan = 0;
        System.out.println("--- PROGRAM PENJUALAN TIKET BIOSKOP ---");
        while (jumlahTiket != 0) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            if (sc.hasNextInt()) {
                jumlahTiket = sc.nextInt();
            } else {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                sc.next(); 
                continue;
            }
            if (jumlahTiket == 0) {
                break; 
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Jumlah tiket tidak boleh negatif. Masukkan ulang.");
                continue;
            }
            double hargaDasar = (double) jumlahTiket * HARGA_TIKET;
            double diskon = 0;
        
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double hargaDiskon = hargaDasar * diskon;
            double hargaAkhir = hargaDasar - hargaDiskon;
            totalPenjualan += hargaAkhir;
            totalTiketTerjual += jumlahTiket;
            System.out.println("  Subtotal: Rp " + (long)hargaDasar);
            System.out.println("  Diskon (" + (int)(diskon * 100) + "%): Rp " + (long)hargaDiskon);
            System.out.println("  Total Bayar: Rp " + (long)hargaAkhir);
        }
        System.out.println("\n--- REKAPITULASI PENJUALAN HARIAN ---");
        System.out.println("Total tiket terjual: " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan: Rp " + (long)totalPenjualan);
    }
}
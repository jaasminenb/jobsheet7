import java.util.Scanner;
public class Tugas2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi; 
        long total = 0; 
        System.out.println("--- PROGRAM PERHITUNGAN BIAYA PARKIR ---");
        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt(); 
            if (jenis == 1 || jenis == 2) { 
                System.out.print("Masukkan durasi parkir (jam): ");
                if (durasi > 5) { 
                    total += 12500;
                    System.out.println("  Tarif flat (> 5 jam): Rp 12.500");
                } else { 
                    if (jenis == 1) { 
                        long biaya = (long) durasi * 3000;
                        total += biaya;
                        System.out.println("  Tarif Mobil (" + durasi + " jam @Rp 3.000): Rp " + biaya);
                    } else { 
                        if (jenis == 2) { 
                            long biaya = (long) durasi * 2000;
                            total += biaya;
                            System.out.println("  Tarif Motor (" + durasi + " jam @Rp 2.000): Rp " + biaya);
                        }
                    }
                }
            } else if (jenis != 0) { 
                System.out.println("Jenis kendaraan tidak dikenali. Harap masukkan 1, 2, atau 0.");
            }
        } while (jenis != 0);
        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + total);
    }
}
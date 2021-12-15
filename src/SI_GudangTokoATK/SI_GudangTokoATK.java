package SI_GudangTokoATK;
import Process.BarangProcess;

import java.util.Scanner;

public class SI_GudangTokoATK {
    private static Scanner input = new Scanner(System.in);
    private static BarangProcess prosesBarang = new BarangProcess();

    public static void main(String[] args) {
        int pil;

        do {
            System.out.println("Jumlah Barang : " + BarangProcess.jumBarang);
            System.out.println("1. Input Barang");
            System.out.println("2. Update Barang");
            System.out.println("3. Lihat Data Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("0. Exit");
            pil = input.nextInt();
            input.nextLine();
            switch (pil) {
                case 1:
                    insertBarang();
                    break;
                case 2:
                    prosesBarang.update();
                    break;
                case 3:
                    prosesBarang.view();
                    break;
                case 4:
                    prosesBarang.delete();
                    break;
            }
        } while (pil !=0);
    }

    static void insertBarang() {
        System.out.println("Input Nama Barang :");
        String nama = input.nextLine();
        System.out.println("Input Harga : ");
        String harga = input.nextLine();
        System.out.println("Input Merk : ");
        String merk = input.nextLine();
        System.out.println("Input jumlah barang : ");
        String jumlah = input.nextLine();

        prosesBarang.insert(nama, harga, merk,jumlah);
        insertKodeBarang();
    }

    static void insertKodeBarang(){
        System.out.println("Input Kode Barang : ");
        String kodeBarang = input.next();
        prosesBarang.insert(prosesBarang.getBarang()[prosesBarang.jumBarang], kodeBarang);
    }
}

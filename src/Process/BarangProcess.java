package Process;

import Entity.Barang;
import Entity.BarangTerdaftar;

import java.util.Scanner;

public class BarangProcess extends Abstract{
    private static Scanner input = new Scanner(System.in);
    private static Barang[] barang = new Barang[100];
    private static BarangTerdaftar[] barangTerdaftar = new BarangTerdaftar[100];
    public static int jumBarang = 0;

    public Barang[] getBarang(){
        return barang;
    }
    public BarangTerdaftar[] getBarangTerdaftar(){
        return barangTerdaftar;
    }
    // Polymorphisme overloading
    public void insert(String nama, String harga, String merk, String jumlah){
        barang[jumBarang] = new Barang(nama, harga, merk, jumlah);
    }

    public void insert(Barang barang, String kodeBarang){
        barangTerdaftar[jumBarang] = new BarangTerdaftar(barang, kodeBarang);
        jumBarang=jumBarang+1;
    }

    public void view(){
        if (jumBarang == 0) {
            System.out.println("Belum ada barang terdaftar");
        } else {
            for (int i = 0; i < jumBarang; i++) {
                System.out.println("=======================================");
                System.out.println("Kode Barang : " + barangTerdaftar[i].getKodeBarang());
                System.out.println("=======================================");
                System.out.println("Nama : " + barang[i].getNama()
                        + "\n Harga : " + barang[i].getHarga()
                        + "\n Merk : " + barang[i].getMerk()
                        + "\n Jumlah : " + barang[i].getJumlah());
                System.out.println("=======================================");
            }
        }
    }

    public void update() {
        System.out.print("Masukkan Kode Barang yang mau di EDIT : ");
        String search = input.next();
        int cari = 0;
        do {
            if (cari == jumBarang) {
                System.err.println("Tidak ada data");
                break;
            } else if (barangTerdaftar[cari].getKodeBarang().equals(search)) {
                int pilEdit;
                do {
                    System.out.println("Pilih data yang ingin diubah : ");
                    System.out.println("1. Lihat Data Barang");
                    System.out.println("2. Nama Barang");
                    System.out.println("3. Harga");
                    System.out.println("4. Merk");
                    System.out.println("5. Jumlah Barang");
                    System.out.println("0. Exit");
                    pilEdit = input.nextInt();
                    input.nextLine();
                    if (pilEdit == 1) {
                        System.out.println("=======================================");
                        System.out.println("Kode Barang : " + barangTerdaftar[cari].getKodeBarang());
                        System.out.println("=======================================");
                        System.out.println("Nama Barang : " + barang[cari].getNama()
                                + "\n Harga : " + barang[cari].getHarga()
                                + "\n Merk : " + barang[cari].getMerk()
                                + "\n Jumlah Barang : " + barang[cari].getJumlah());
                        System.out.println("=======================================");
                    } else if (pilEdit == 2) {
                        System.out.print("Ubah Nama Barang : ");
                        String editNama = input.nextLine();
                        barang[cari].setNama(editNama);
                    } else if (pilEdit == 3){
                        System.out.print("Ubah Harga : ");
                        String editHarga = input.nextLine();
                        barang[cari].setHarga(editHarga);
                    } else if (pilEdit == 4) {
                        System.out.print("Ubah Merk : ");
                        String editMerk = input.nextLine();
                        barang[cari].setMerk(editMerk);
                    } else if (pilEdit == 5) {
                        System.out.print("Ubah Jumlah Barang : ");
                        String editJumlah = input.nextLine();
                        barang[cari].setJumlah(editJumlah);
                    }
                } while (pilEdit != 0);
                break;
            } else {
                cari = cari + 1;
            }
        }while (true);
    }

    public void delete(){
        System.out.print("Masukkan Kode Barang yang akan di HAPUS : ");
        String search = input.next();
        input.nextLine();
        int cari = 0;
        do {
            if (cari == jumBarang) {
                System.err.println("Tidak ada data!");
                break;
            } else if (barangTerdaftar[cari].getKodeBarang().equals(search)) {
                if (cari == jumBarang - 1) {
                    jumBarang = jumBarang - 1;
                } else {
                    for (int i = cari; i < jumBarang; i++) {
                        barangTerdaftar[i] = barangTerdaftar[i + 1];
                        barang[i] = barang[i + 1];
                    }
                    jumBarang = jumBarang - 1;
                }
                break;
            } else {
                cari = cari + 1;
            }
        } while (true);
    }
}

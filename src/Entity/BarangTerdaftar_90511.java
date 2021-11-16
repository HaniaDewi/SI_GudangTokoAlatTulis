/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class BarangTerdaftar_90511 {
    private Barang_90511 barang;
    private String kodeBarang;
    
    public BarangTerdaftar_90511(Barang_90511 barang, String kodeBarang) {
        this.barang = barang;
        this.kodeBarang = kodeBarang;
    }

    public Barang_90511 getBarang() {
        return barang;
    }
    public void setBarang_90511(Barang_90511 barang) {
        this.barang = barang;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    } 
}

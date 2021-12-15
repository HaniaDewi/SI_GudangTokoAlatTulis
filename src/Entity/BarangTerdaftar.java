package Entity;

public class BarangTerdaftar {
    private Barang barang;
    private String kodeBarang;

    public BarangTerdaftar(Barang barang, String kodeBarang) {
        this.barang = barang;
        this.kodeBarang = kodeBarang;
    }

    public Barang getBarang() {
        return barang;
    }
    public void setBarang_90511(Barang barang) {
        this.barang = barang;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
}

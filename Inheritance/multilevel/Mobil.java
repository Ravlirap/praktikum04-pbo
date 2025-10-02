package multilevel;

public class Mobil extends Kendaraan {
    protected int tahunKeluar;

    public Mobil(String merk, int tahunKeluar) {
        super(merk);
        this.tahunKeluar = tahunKeluar;
    }

    public void infoTahun() {
        System.out.println(merk + " keluar pada tahun " + tahunKeluar );
    }
}


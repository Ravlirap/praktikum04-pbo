package hybrid;

class Mobil extends Kendaraan {
    protected int tahunKeluar;

    public Mobil(String merk, int tahunKeluar) {
        super(merk);
        this.tahunKeluar = tahunKeluar;
    }

    public void klakson() {
        System.out.println(merk + " membunyikan klakson! TOTTTT");
    }
}

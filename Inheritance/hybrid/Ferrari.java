package hybrid;

class Ferrari extends Mobil {
    private String tipe;

    public Ferrari(String merk, int tahunKeluar, String tipe) {
        super(merk, tahunKeluar);
        this.tipe = tipe;
    }

    public void infoTahun() {
        System.out.println("Mobil " + merk + " tipe " + tipe + " keluar tahun " + tahunKeluar);
    }
}

package multilevel;

public class Sedan extends Mobil {
    private String tipe;

    public Sedan(String merk, int tahunKeluar, String tipe) {
        super(merk, tahunKeluar);
        this.tipe = tipe;
    }

    public void infoSedan() {
        System.out.println(merk + " adalah sedan tipe " + tipe);
    }
}
package multilevel;

public class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void berjalan() {
        System.out.println(merk + " sedang berjalan...");
    }
}


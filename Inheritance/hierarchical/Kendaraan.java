package hierarchical;

class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void jalan() {
        System.out.println(merk + " sedang berjalan di jalan raya...");
    }
}


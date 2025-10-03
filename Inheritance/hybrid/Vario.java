package hybrid;

class Vario extends Motor {
    private String tipe;

    public Vario(String merk, String warna, String tipe) {
        super(merk, warna);
        this.tipe = tipe;
    }

    public void infoWarna() {
        System.out.println("Motor " + merk + " tipe " + tipe + " berwarna " + warna);
    }
}

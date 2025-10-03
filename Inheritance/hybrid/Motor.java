package hybrid;

class Motor extends Kendaraan {
    protected String warna;

    public Motor(String merk, String warna) {
        super(merk);
        this.warna = warna;
    }

    public void ngebut() {
        System.out.println(merk + " dengan warna " + warna + " sedang ngebut!");
    }
}
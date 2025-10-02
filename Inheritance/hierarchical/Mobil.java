package hierarchical;

class Mobil extends Kendaraan {
    public Mobil(String merk) {
        super(merk);
    }

    public void klakson() {
        System.out.println(merk + " membunyikan klakson: Tiiiin!");
    }
}
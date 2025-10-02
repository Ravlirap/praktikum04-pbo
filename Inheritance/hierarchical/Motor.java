package hierarchical;

class Motor extends Kendaraan {
    public Motor(String merk) {
        super(merk);
    }

    public void ngebut() {
        System.out.println(merk + " melaju dengan kecepatan tinggi!");
    }
}


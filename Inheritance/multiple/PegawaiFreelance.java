package multiple;

class PegawaiFreelance implements Pegawai, Freelance {
    private String nama;
    private String proyek;

    public PegawaiFreelance(String nama, String proyek) {
        this.nama = nama;
        this.proyek = proyek;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " bekerja seperti pegawai tetap di kantor.");
    }

    @Override
    public void ambilProyek() {
        System.out.println(nama + " juga mengerjakan proyek freelance: " + proyek);
    }
}


package SetterGetter;
class Pegawai {
    private String nama;
    private int gaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(int gaji) {
        if (gaji > 0) {
            this.gaji = gaji;
        } else {
            System.out.println("Gaji harus lebih besar dari 0!");
        }
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }
}

package AcessModifier;

public class MainAccessMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.tampilkanNama();

        System.out.println(m.namaPublic);
    }
}

package SetterGetter;
public class MainSetterGetter {
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p.setNama("Azhar");
        p.setGaji(5000000);

        System.out.println("Nama Pegawai: " + p.getNama());
        System.out.println("Gaji Pegawai: Rp" + p.getGaji());
    }
}
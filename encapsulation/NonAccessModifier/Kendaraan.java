package NonAccessModifier;
class Kendaraan {
    public static int jumlahKendaraan = 0; // static: milik semua objek
    public final String tipe = "Mobil";    // final: tidak bisa diubah

    public void info() {
        System.out.println("Tipe Kendaraan: " + tipe);
        System.out.println("Jumlah Kendaraan: " + jumlahKendaraan);
    }
}

package NonAccessModifier;
class Kendaraan {
    public static int jumlahKendaraan = 0;
    public final String tipe = "Mobil";

    public void info() {
        System.out.println("Tipe Kendaraan: " + tipe);
        System.out.println("Jumlah Kendaraan: " + jumlahKendaraan);
    }
}

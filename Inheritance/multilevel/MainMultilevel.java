package multilevel;
public class MainMultilevel {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", 1994, "Camry");

        sedan.berjalan();    // dari Kendaraan
        sedan.infoTahun();    // dari Mobil
        sedan.infoSedan();   // dari Sedan
    }
}

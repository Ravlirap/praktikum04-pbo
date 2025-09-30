package NonAccessModifier;

public class MainNonAccessKendaaraan {
    public static void main(String[] args) {
        Kendaraan.jumlahKendaraan = 5; 

        Kendaraan k = new Kendaraan();
        k.info();
    }
}

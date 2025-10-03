package hybrid;

public class MainHybrid {
    public static void main(String[] args) {
        // Hierarchical Inheritance
        Mobil m = new Mobil("Toyota", 2020);
        Sepeda s = new Sepeda("Polygon");
        Motor mo = new Motor("Yamaha", "Hitam");

        m.jalan();
        m.klakson();
        s.gowes();
        mo.ngebut();

        System.out.println();

        // Multilevel Inheritance
        Ferrari f = new Ferrari("Ferrari", 2022, "F8 Tributo");
        f.jalan();
        f.klakson();
        f.infoTahun();

        Vario v = new Vario("Honda Vario", "Merah", "150");
        v.jalan();
        v.ngebut();
        v.infoWarna();
    }
}

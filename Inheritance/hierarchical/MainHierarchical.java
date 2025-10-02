package hierarchical;

public class MainHierarchical {
    public static void main(String[] args) {
        Mobil m = new Mobil("Toyota");
        Motor r = new Motor("Honda");
        Sepeda s = new Sepeda("Polygon");

        m.jalan();
        m.klakson();

        r.jalan();
        r.ngebut();

        s.jalan();
        s.gowes();
    }
}


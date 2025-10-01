package single;
public class Kucing extends Hewan {
    public Kucing(int jumlahKaki) {
        super(jumlahKaki); // memanggil constructor Hewan
    }

    public void suara() {
        System.out.println("Kucing mengeong: Meong...");
    }
}

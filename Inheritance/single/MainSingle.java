package single;

public class MainSingle {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing(4);

        System.out.println("Jumlah kaki kucing: " + kucing1.jumlahKaki);
        kucing1.makan();
        kucing1.tidur();
        kucing1.suara();
    }
}


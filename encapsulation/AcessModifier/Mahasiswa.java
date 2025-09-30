package AcessModifier;

class Mahasiswa {
    public String namaPublic = "Ravli";     
    private String namaPrivate = "Rap";  
    protected String namaProtected = "Pli"; 
    String namaDefault = "Ravli2403066";          

    public void tampilkanNama() {
        System.out.println("Nama Public: " + namaPublic);
        System.out.println("Nama Private: " + namaPrivate);
        System.out.println("Nama Protected: " + namaProtected);
        System.out.println("Nama Default: " + namaDefault);
    }
}

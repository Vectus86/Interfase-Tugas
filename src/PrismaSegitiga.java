public class PrismaSegitiga implements Bangun{

    private int luasAlas;
    private int Alas;
    private int Tinggi;
    private int TinggiPrisma;
    private int kelilingAlas;


    PrismaSegitiga(int luasAlas, int Tinggi, int TinggiPrisma, int kelilingAlas, int alas){
        this.luasAlas = luasAlas;
        this.Tinggi = Tinggi;
        this.TinggiPrisma = TinggiPrisma;
        this.kelilingAlas = kelilingAlas;
        this.Alas = alas;
        hitungVolume();
        hitungLuasPermukaan();
    }
    @Override
    public void namaBangun() {
        System.out.println("Prisma Segitiga");
    }

    @Override
    public double hitungVolume() {
        return ((float)1/2) * Alas * Tinggi * TinggiPrisma;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2 * luasAlas) + (kelilingAlas * Tinggi);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Nama Bangun = Prisma Segitiga ");
        System.out.println("Volume " +hitungVolume());
        System.out.println("Luas Permukaan = " +hitungLuasPermukaan());
    }
}

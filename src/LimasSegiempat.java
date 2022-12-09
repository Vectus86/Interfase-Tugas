public class LimasSegiempat implements Bangun{

    private int luasAlas;
    private int tinggi;
    private int TinggiTegak;

    LimasSegiempat(int luasAlas, int Tinggi, int TinggiTegak){
        this.luasAlas = luasAlas;
        this.tinggi = Tinggi;
        this.TinggiTegak = TinggiTegak;
        hitungVolume();
        hitungLuasPermukaan();
    }
    @Override
    public void namaBangun() {
        System.out.println("Lisma Segi Empat");
    }

    @Override
    public double hitungVolume() {
        return ((double)1/3) * luasAlas * tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return luasAlas * 4 * TinggiTegak;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Nama Bangun = Limas Segi Empat ");
        System.out.println("Volume " +hitungVolume());
        System.out.println("Luas Permukaan = " +hitungLuasPermukaan());
    }
}

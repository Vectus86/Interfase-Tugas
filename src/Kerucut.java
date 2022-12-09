public class Kerucut implements Bangun{

    private int Selimut;
    private int Tinggi;
    private int Radius;

    Kerucut(int Selimut, int Tinggi, int Radius){
        this.Selimut = Selimut;
        this.Tinggi = Tinggi;
        this.Radius = Radius;
        hitungVolume();
        hitungLuasPermukaan();
    }

    @Override
    public void namaBangun() {
        System.out.println("Kerucut");
    }

    @Override
    public double hitungVolume() {
        return ((float)1/3) * Math.PI * Math.pow(Radius,2) * Tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return Math.PI * Math.pow(Radius,2) + (Math.PI * Radius * Selimut);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Nama Bangun = Kerucut ");
        System.out.println("Volume " +hitungVolume());
        System.out.println("Luas Permukaan = " +hitungLuasPermukaan());
    }
}

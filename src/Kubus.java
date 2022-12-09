public class Kubus implements Bangun {

    private int Sisi;

    public Kubus(int Sisi){
        this.Sisi = Sisi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }
    @Override
    public void namaBangun() {
        System.out.println("Kubus");

    }

    @Override
    public double hitungVolume() {
        return Math.pow(Sisi,3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(Sisi,2);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Nama Bangun = Kubus ");
        System.out.println("Volume " +hitungVolume());
        System.out.println("Luas Permukaan = " +hitungLuasPermukaan());

    }
}

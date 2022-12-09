public class Bola implements Bangun{

    private double Radius;

    public Bola(int Radius){
        this.Radius = Radius;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    @Override
    public void namaBangun() {
        System.out.println("Bola");
    }

    @Override
    public double hitungVolume() {
        return ((float)4/3) * Math.PI * Math.pow(Radius,3);
    }

    @Override
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(Radius,2);
    }

    @Override
    public void tampilHasil(){
        System.out.println("Nama Bangun = Bola ");
        System.out.println("Volume " +hitungVolume());
        System.out.println("Luas Permukaan = " +hitungLuasPermukaan());
    }
}

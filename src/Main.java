import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        String NamaBangun;

        System.out.println("Masukkan Nama Bangun = ");
        NamaBangun = scan.nextLine();
        
        if("Bola".equalsIgnoreCase(NamaBangun) || "1".equalsIgnoreCase(NamaBangun)){
            System.out.println("Masukkan Radius = ");
            Bola bangun = new Bola(scan.nextInt());
            bangun.hitungVolume();
            bangun.hitungLuasPermukaan();
            bangun.tampilHasil();
        }
    }
}
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
        } else if ("Kubus".equalsIgnoreCase(NamaBangun) || "2".equalsIgnoreCase(NamaBangun)){
            System.out.println("Masukkan SISI = ");
            Kubus bangun = new Kubus(scan.nextInt());
            bangun.hitungVolume();
            bangun.hitungLuasPermukaan();
            bangun.tampilHasil();
        } else if ("Prisma Segitiga".equalsIgnoreCase(NamaBangun) || "3".equalsIgnoreCase(NamaBangun)) {
            System.out.println("Masukkan Luas Alas = ");
            int luasAlas = scan.nextInt();
            System.out.println("Masukkan Tinggi Prisma = ");
            int TinggiPrisma = scan.nextInt();
            System.out.println("Masukkan Tinggi = ");
            int Tinggi = scan.nextInt();
            System.out.println("Keliling Alas = ");
            int kelilingAlas = scan.nextInt();
            System.out.println("Alas = ");
            int alas = scan.nextInt();
            PrismaSegitiga bangun = new PrismaSegitiga(luasAlas, TinggiPrisma, Tinggi, kelilingAlas, alas);
            bangun.tampilHasil();
        } else if ("Kerucut".equalsIgnoreCase(NamaBangun) || "4".equalsIgnoreCase(NamaBangun)) {
            System.out.println("Masukkan Selimut = ");
            int selimut = scan.nextInt();
            System.out.println("Masukkan Tinggi = ");
            int tinggi = scan.nextInt();
            System.out.println("Masukkan Radius = ");
            int radius = scan.nextInt();
            Kerucut Bangun = new Kerucut(selimut,tinggi,radius);
            Bangun.tampilHasil();
        } else if ("Limas Segi Empat".equalsIgnoreCase(NamaBangun) || "5".equalsIgnoreCase(NamaBangun)) {
            System.out.println("Masukkan Tinggi = ");
            int Tinggi = scan.nextInt();
            System.out.println("Masukkan Sisi = ");
            int Sisi = scan.nextInt();
            System.out.println("Masukkan Tinggi Selimut = ");
            int TSelimut = scan.nextInt();
            LimasSegiempat bangun = new LimasSegiempat(Tinggi, Sisi, TSelimut);
            bangun.tampilHasil();
        }
    }
}
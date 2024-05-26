package No_1;

import java.util.Scanner;

public class Kelas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        do {
            System.out.println("Konversi Panjang");
            System.out.println("[1] KM");
            System.out.println("[2] HM");
            System.out.println("[3] DAM");
            System.out.println("[4] M");
            System.out.println("[5] DM");
            System.out.println("[6] CM");
            System.out.println("[7] MM");
            System.out.println("Dari :");
            int dari = sc.nextInt();
            System.out.println("Ke :");
            int ke = sc.nextInt();
            System.out.println("NIlai : ");
            double nilai = sc.nextDouble();
            System.out.println("Hasil : " + convert(dari, ke, nilai));
            System.out.println("\nLAnjut ? y/n");
            n = sc.next();
        } while (!n.equals("n"));
    }

    static double convert(int dari, int ke, double nilai) {
        double km = nilai / Math.pow(10, dari);
        return km * Math.pow(10, ke);
    }
}

package No_1;

import java.util.Scanner;

public class Kelass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil, pil2;
        double hasil;
        do {
            System.out.println("Konversi Panjang");
            System.out.println("[1] KM");
            System.out.println("[2] HM");
            System.out.println("[3] DAM");
            System.out.println("[4] M");
            System.out.println("[5] DM");
            System.out.println("[6] CM");
            System.out.println("[7] MM");
            System.out.println("[0] OUT");
            System.out.print("Pilihan : ");
            pil = sc.nextInt();

            switch (pil) {
                case 1:
                    System.out.println("[2] HM");
                    System.out.println("[3] DAM");
                    System.out.println("[4] M");
                    System.out.println("[5] DM");
                    System.out.println("[6] CM");
                    System.out.println("[7] MM");
                    System.out.println("[0] OUT");
                    System.out.print("Pilihan : ");
                    pil2 = sc.nextInt();
                    switch (pil2) {
                        case 2:
                            System.out.print("Nilai : ");
                            double nilai = sc.nextDouble();
                            hasil = nilai * 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 3:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 100;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 4:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 1000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 5:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 10000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 6:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 100000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 7:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 1000000;
                            System.out.println("Hasil : " + hasil);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("[1] KM");
                    System.out.println("[3] DAM");
                    System.out.println("[4] M");
                    System.out.println("[5] DM");
                    System.out.println("[6] CM");
                    System.out.println("[7] MM");
                    System.out.println("[0] OUT");
                    System.out.print("Pilihan : ");
                    pil2 = sc.nextInt();
                    switch (pil2) {
                        case 1:
                            System.out.print("Nilai : ");
                            double nilai = sc.nextDouble();
                            hasil = nilai / 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 3:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 4:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 100;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 5:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 1000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 6:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 10000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 7:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 100000;
                            System.out.println("Hasil : " + hasil);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("[1] KM");
                    System.out.println("[2] HM");
                    System.out.println("[4] M");
                    System.out.println("[5] DM");
                    System.out.println("[6] CM");
                    System.out.println("[7] MM");
                    System.out.println("[0] OUT");
                    System.out.print("Pilihan : ");
                    pil2 = sc.nextInt();
                    switch (pil2) {
                        case 1:
                            System.out.print("Nilai : ");
                            double nilai = sc.nextDouble();
                            hasil = nilai / 100;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 2:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai / 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 4:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 5:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 100;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 6:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 1000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 7:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 10000;
                            System.out.println("Hasil : " + hasil);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("[1] KM");
                    System.out.println("[2] HM");
                    System.out.println("[3] DAM");
                    System.out.println("[5] DM");
                    System.out.println("[6] CM");
                    System.out.println("[7] MM");
                    System.out.println("[0] OUT");
                    System.out.print("Pilihan : ");
                    pil2 = sc.nextInt();
                    switch (pil2) {
                        case 1:
                            System.out.print("Nilai : ");
                            double nilai = sc.nextDouble();
                            hasil = nilai / 1000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 2:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai / 100;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 3:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai / 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 5:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 6:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 100;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 7:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 1000;
                            System.out.println("Hasil : " + hasil);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("[1] KM");
                    System.out.println("[2] HM");
                    System.out.println("[3] DAM");
                    System.out.println("[4] M");
                    System.out.println("[6] CM");
                    System.out.println("[7] MM");
                    System.out.println("[0] OUT");
                    System.out.print("Pilihan : ");
                    pil2 = sc.nextInt();
                    switch (pil2) {
                        case 1:
                            System.out.print("Nilai : ");
                            double nilai = sc.nextDouble();
                            hasil = nilai / 10000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 2:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai / 1000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 3:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai / 100;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 4:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai / 10;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 6:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 1000;
                            System.out.println("Hasil : " + hasil);
                            break;
                        case 7:
                            System.out.print("Nilai : ");
                            nilai = sc.nextDouble();
                            hasil = nilai * 10000;
                            System.out.println("Hasil : " + hasil);
                            break;
                    }
                    break;
                case 6:

                    break;
                case 7:

                    break;
            }
        } while (pil != 0);
    }

}

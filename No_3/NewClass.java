package No_3;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("[1] Rupiah ke Dollar");
        System.out.println("[2] Dollar ke Rupiah");
        System.out.println("Pil : ");
        int pil = sc.nextInt();
        double hasil = 0 , nilai;
        if (pil == 1) {
            System.out.println("Nilai : ");
            nilai = sc.nextDouble();
            hasil = nilai / 16000;            
        System.out.println("\nHasil : $ "+hasil);
        }else if (pil == 2){
            System.out.println("Nilai : ");
            nilai = sc.nextDouble();
            hasil = nilai * 16000;   
        System.out.println("\nHasil : Rp. "+hasil);
        }
 
    }

}

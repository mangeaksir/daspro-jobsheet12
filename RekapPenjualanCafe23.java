import java.util.Scanner;

public class RekapPenjualanCafe23 {

    static Scanner sc = new Scanner(System.in);

    // Nama menu (5 menu)
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    static void inputData(int[][] penjualan) {
        System.out.println("=== INPUT DATA PENJUALAN 7 HARI ===");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("  Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilData(int[][] penjualan) {
        System.out.println("\n=== TABEL PENJUALAN 7 HARI ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t"); 
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuTertinggi(int[][] penjualan) {

        int maxTotal = 0;
        int idxMenuTertinggi = 0;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                idxMenuTertinggi = i;
            }
        }

        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[idxMenuTertinggi]);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    static void rataRataMenu(int[][] penjualan) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / penjualan[i].length;
            System.out.println(menu[i] + " = " + rata);
        }
    }


    public static void main(String[] args) {

        int[][] penjualan = new int[5][7];

        inputData(penjualan);
        tampilData(penjualan);
        menuTertinggi(penjualan);
        rataRataMenu(penjualan);

    }
}

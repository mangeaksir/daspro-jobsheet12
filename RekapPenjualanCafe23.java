import java.util.Scanner;

public class RekapPenjualanCafe23 {

    static void inputData(int[][] penjualan, String[] menu, int hari) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nInput penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < hari; j++) {
                System.out.print("Hari ke-" + (j+1) + " = ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilData(int[][] penjualan, String[] menu, int hari) {
        System.out.println("\n=== DATA PENJUALAN KAFE ===");

        System.out.print("Menu\t");
        for (int j = 0; j < hari; j++) {
            System.out.print("H" + (j+1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < hari; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuTertinggi(int[][] penjualan, String[] menu, int hari) {
        int maxTotal = -1;
        int indexMax = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < hari; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println(menu[indexMax] + " dengan total = " + maxTotal);
    }

    static void rataRataMenu(int[][] penjualan, String[] menu, int hari) {
        System.out.println("\nRata-rata penjualan tiap menu:");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < hari; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / hari;
            System.out.println(menu[i] + " = " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); 

        String[] menu = new String[jumlahMenu];

        // Input nama menu
        System.out.println("\nMasukkan nama-nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.print("\nMasukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();

        int[][] penjualan = new int[jumlahMenu][jumlahHari];


        inputData(penjualan, menu, jumlahHari);
        tampilData(penjualan, menu, jumlahHari);
        menuTertinggi(penjualan, menu, jumlahHari);
        rataRataMenu(penjualan, menu, jumlahHari);
    }
}

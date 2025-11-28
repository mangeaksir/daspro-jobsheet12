import java.util.Scanner;
public class Kafe23 {
    public static void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode Promo valid! Anda mendapatkan diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode Promo valid! Anda Mendapatkan diskon 30%");
        } else if (!kodePromo.equalsIgnoreCase("NONE")) {
            System.out.println("Kode promo invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan");
    }   
    
    public static int hitungTotalHarga23 (int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid! Diskon 50%");
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        }
        else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid! Diskon 30%");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        }
        else {
            System.out.println("Kode promo invalid! Tidak ada diskon.");
        }

        return hargaTotal;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode promo : ");
        String kodePromoUser = sc.next();

        Menu("Andi", true, kodePromoUser);

        System.out.print("Berapa jenis menu yang ingin dipesan?: ");
        int jumlahJenis = sc.nextInt();
        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalPerMenu = hitungTotalHarga23(pilihanMenu, banyakItem, kodePromoUser);

            System.out.println("Total harga menu ini: Rp " + totalPerMenu);
            totalKeseluruhan += totalPerMenu;
        }

        System.out.println("\n===================================");
        System.out.println("Total keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
        System.out.println("===================================");
    }
}
    


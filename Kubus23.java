public class Kubus23 {

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        int s = 4;

        System.out.println("Sisi Kubus = " + s);
        System.out.println("Volume Kubus = " + hitungVolume(s));
        System.out.println("Luas Permukaan Kubus = " + hitungLuasPermukaan(s));
    }
}

import java.util.Scanner;

public class KonversiSatuanPanjang {
    /**
     * Method ini untuk mengkonversi dari meter ke kilometer
     * @param meters sebagai nilai yang akan dikonversi
     * @return untuk mengembalikan nilai
     */
    public static double meterKeKilometer(double meters) {
        return meters / 1000.0;
    }

    /**
     * Method ini untuk mengkonversi dari meter ke centimeter
     * @param meters sebagai nilai yang akan dikonversi
     * @return untuk mengembalikan nilai
     */
    public static double meterKeCentimeter(double meters) {
        return meters * 100.0;
    }

    /**
     * Method ini untuk mengkonversi dari meter ke milimeter
     * @param meters sebagai nilai yang akan dikonversi
     * @return untuk mengembalikan nilai
     */
    public static double meterKeMillimeter(double meters) {
        return meters * 1000.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan meter : ");
        double meters = sc.nextDouble();

        double kilometers = meterKeKilometer(meters);
        double centimeters = meterKeCentimeter(meters);
        double millimeters = meterKeMillimeter(meters);

        System.out.println(meters + " meter sama dengan " + kilometers + " kilometer.");
        System.out.println(meters + " meter sama dengan " + centimeters + " centimeter.");
        System.out.println(meters + " meter sama dengan " + millimeters + " milimeter.");
    }
}

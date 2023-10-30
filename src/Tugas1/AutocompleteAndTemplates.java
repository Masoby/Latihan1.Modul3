package Tugas1;

public class AutocompleteAndTemplates {

    public static class Kalkulator {

        public int tambah(int angka1, int angka2) {
            return angka1 + angka2;
        }


        public int kurang(int angka1, int angka2) {
            return angka1 - angka2;
        }


        public int kali(int angka1, int angka2) {
            return angka1 * angka2;
        }
        public int kali(int angka1, int angka2) {
                    return angka1 * angka2;

        public double bagi(double angka1, double angka2) {
            if (angka2 == 0) {
                System.out.println("Error: Tidak dapat membagi dengan nol.");
                return -1; // Nilai kembalian untuk kondisi error
            }
            return angka1 / angka2;
        }

        public static void main(String[] args) {
            Kalkulator calc = new Kalkulator();

            // Contoh penggunaan operasi kalkulator
            int a = 10;
            int b = 5;

            System.out.println("Penambahan: " + calc.tambah(a, b));
            System.out.println("Pengurangan: " + calc.kurang(a, b));
            System.out.println("Perkalian: " + calc.kali(a, b));
            System.out.println("Pembagian: " + calc.bagi(a, b));
        }
    }

}

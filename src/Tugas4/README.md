package Tugas2;

/** * Kelas untuk menghitung luas permukaan kerucut
*/






public class LuasKerucut {
/**     * Metode untuk menghitung luas permukaan kerucut
*@param garisPelukis Garis pelukis kerucut
* @ @param jariJari Jari-jari kerucut
*      * return Luas permukaan kerucut     */
public double hitungLuasKerucut(double jariJari, double garisPelukis) {
return Math.PI * jariJari * (jariJari + garisPelukis);
}
public static void main(String[] args) {
// Contoh penggunaan kelas LuasKerucut
LuasKerucut luasKerucut = new LuasKerucut();

        double jariJari = 5.0; // contoh jari-jari
        double garisPelukis = 10.0; // contoh garis pelukis
        double luas = luasKerucut.hitungLuasKerucut(jariJari, garisPelukis);
        System.out.println("Luas permukaan kerucut: " + luas);    }
}

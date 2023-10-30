# Luas Permukaan KerucutRumus luas permukaan kerucut: L = (π r s) + (π r²) atau L = π r (s + r)
Menghitung Luas Permukaan Kerucut dengan menggunakan aplikasi intelij idea
# cara menjalankan nya 1. ganti ankga sesuai soal anda
2. lalu running tekan sebelah current file atau tekan Shift+F10
# Deskripsi
Open source bisa dipakai untuk public gratis
# Informasi 
Mempermudah dan mempercepat pengguna/User untuk menghitung lebih cepat dan efisien

```java 
public double hitungLuasKerucut(double jariJari, double garisPelukis) {        return Math.PI * jariJari * (jariJari + garisPelukis);
}    public static void main(String[] args) {
// Contoh penggunaan kelas LuasKerucut        LuasKerucut luasKerucut = new LuasKerucut();
double jariJari = 5.0; // contoh jari-jari
double garisPelukis = 10.0; // contoh garis pelukis        double luas = luasKerucut.hitungLuasKerucut(jariJari, garisPelukis);
System.out.println("Luas permukaan kerucut: " + luas);    }}
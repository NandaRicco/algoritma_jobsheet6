public class Dosen14 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen14 (String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampilInformasi(){
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia Dosen    : " + usia);
    }
}

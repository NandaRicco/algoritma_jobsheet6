public class Mahasiswa14 {
    
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa14(){

    }

    Mahasiswa14 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("Nama  : " + nama);
        System.out.println("Nim   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}

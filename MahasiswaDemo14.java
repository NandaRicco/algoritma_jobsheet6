import java.util.Scanner;

public class MahasiswaDemo14 {

    public static void main(String[] args) {

        MahasiswaBerpestasi14 list = new MahasiswaBerpestasi14();
        // Mahasiswa14 m1 = new Mahasiswa14 ("123", "Nanda", "2A", 3.8);
        // Mahasiswa14 m2 = new Mahasiswa14 ("124", "Budi", "2A", 3.4);
        // Mahasiswa14 m3 = new Mahasiswa14 ("125", "Toni", "2A", 3.5);
        // Mahasiswa14 m4 = new Mahasiswa14 ("126", "Grace", "2A", 3.9);
        // Mahasiswa14 m5 = new Mahasiswa14 ("127", "Michelle", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();

            list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));
        }
        

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC):");
        list.insertionSort();
        list.tampil();
    }
}

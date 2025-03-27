import java.util.Scanner;

public class DosenMain14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DataDosen14 list = new DataDosen14();
        int menu;

        do {
            System.out.println("\nPilih menu yang ingin diakses:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Urutan Dosen Termuda ke Tertua");
            System.out.println("4. Urutan Dosen Tertua ke Termuda");
            System.out.println("5. Cari Dosen berdasarkan nama");
            System.out.println("6. Cari Dosen berdasarkan usia");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); 

            if (menu == 1) {
                System.out.print("Kode : ");
                String kode = input.nextLine();
                System.out.print("Nama : ");
                String nama = input.nextLine();
                System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
                boolean jenisKelamin = input.nextBoolean();
                input.nextLine(); 
                System.out.print("Usia : ");
                int usia = input.nextInt();
                input.nextLine(); 

                list.tambah(new Dosen14(kode, nama, jenisKelamin, usia));
                list.insertionSort();

            } else if (menu == 2) {
                list.tampil();

            } else if (menu == 3) {
                list.bubbleSort();
                list.tampil();

            } else if (menu == 4) {
                list.selectionSort();
                list.tampil();

            } else if (menu == 5) {
                System.out.println("Masukkan nama dosen yang ingin dicari");
                System.out.print("Nama Dosen: ");
                String cari = input.nextLine();

                double posisi = list.sequentialSearching(cari);
                int pss = (int) posisi;
                list.tampilPosisi(cari, pss);
                list.tampilDataSearch(cari, pss);

                int jumlahHasil = 0;
                for (int j = 0; j < list.getJumlah(); j++) {
                    if (list.dataDosen[j].nama.equals(cari)) {
                        jumlahHasil++;
                    }
                }

                list.tampilPeringatanJikaBanyakHasil(jumlahHasil);
                list.tampilSemuaHasilNama(cari);

            } else if (menu == 6) {
                System.out.println("Masukkan usia dosen yang ingin dicari");
                System.out.print("Usia Dosen: ");
                int cariUsia = input.nextInt();
                input.nextLine();

                double posisi2 = list.findBinarySearch(cariUsia, 0, list.getJumlah() - 1);
                int pss2 = (int) posisi2;
                list.tampilPosisiUsia(cariUsia, pss2);
                list.tampilDataSearchUsia(cariUsia, pss2);

                int jumlahHasil = 0;
                for (int j = 0; j < list.getJumlah(); j++) {
                    if (list.dataDosen[j].usia == cariUsia) {
                        jumlahHasil++;
                    }
                }

                list.tampilPeringatanJikaBanyakHasil(jumlahHasil);
                list.tampilSemuaHasilUsia(cariUsia);

            } else if (menu == 7) {
                System.out.println("Terimakasih");
            } else {
                System.out.println("Menu tidak ada, silakan pilih kembali.");
            }

        } while (menu != 7);
    }
}
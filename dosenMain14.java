import java.util.Scanner;

public class dosenMain14 {

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
            System.out.println("5. Keluar");
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
                System.out.print("Usia : ");
                int usia = input.nextInt();
                input.nextLine(); 

                list.tambah(new Dosen14(kode, nama, jenisKelamin, usia));
            } else if (menu == 2) {
                list.tampil();
            } else if (menu == 3) {
                list.bubbleSort();
                list.tampil();
            } else if (menu == 4) {
                list.selectionSort();
                list.tampil();
            } else if (menu == 5) {
                System.out.println("Terimakasih");
            } else {
                System.out.println("Menu tidak ada, silakan pilih kembali.");
            }

        } while (menu != 5);
    }
}

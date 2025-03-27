public class DataDosen14 {

    Dosen14[] dataDosen = new Dosen14[10];
    int idx = 0;

    public void tambah(Dosen14 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen penuh!");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++){
            dataDosen[i].tampilInformasi();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen14 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen14 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < idx; i++){
            Dosen14 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia){
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int getJumlah() {
        return idx;
    }
    
    int sequentialSearching(String cari){
        int posisi = -1;
        for (int j = 0; j < idx; j++){
            if (dataDosen[j].nama.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    void tampilPosisi(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan nama " + nama + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    void tampilPosisiUsia(int usia, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan nama " + usia + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Dosen dengan nama " + usia + " tidak ditemukan.");
        }
    }
    
    void tampilDataSearch(String nama, int pos) {
        if (pos != -1) {
            System.out.println("Kode         : " + dataDosen[pos].kode);
            System.out.println("Nama         : " + dataDosen[pos].nama);
            System.out.println("Jenis Kelamin: " + (dataDosen[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia         : " + dataDosen[pos].usia);
        } else {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == dataDosen[mid].usia){
                return (mid);
            } 
            else if (dataDosen[mid].usia > cari){
                return findBinarySearch(cari, left, mid - 1);
            } 
            else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilDataSearchUsia(int usia, int pos) {
        if (pos != -1) {
            System.out.println("Kode         : " + dataDosen[pos].kode);
            System.out.println("Nama         : " + dataDosen[pos].nama);
            System.out.println("Jenis Kelamin: " + (dataDosen[pos].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia         : " + dataDosen[pos].usia);
        } else {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        }
    }

    void tampilPeringatanJikaBanyakHasil(int jumlahHasil) {
        if (jumlahHasil > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu hasil pencarian!");
        }
    }

    void tampilSemuaHasilNama(String nama) {
        boolean ditemukan = false;
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j].nama.equals(nama)) {
                dataDosen[j].tampilInformasi();
                System.out.println("-----------------------------");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        }
    }
    
    void tampilSemuaHasilUsia(int usia) {
        boolean ditemukan = false;
        for (int j = 0; j < idx; j++) {
            if (dataDosen[j].usia == usia) {
                dataDosen[j].tampilInformasi();
                System.out.println("-----------------------------");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        }
    }
}
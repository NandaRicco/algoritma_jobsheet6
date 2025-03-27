public class MahasiswaBerpestasi14 {
    
    Mahasiswa14 [] listMhs = new Mahasiswa14[5];
    int idx;

    void tambah (Mahasiswa14 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++){
            listMhs[i].tampilInformasi();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) { 
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa14 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < idx - 1; i++){
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++){
                if (listMhs[j].ipk > listMhs[maxIdx].ipk){
                    maxIdx = j;
                }
            }
            Mahasiswa14 temp = listMhs[maxIdx];
            listMhs[maxIdx] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < idx; i++){
            Mahasiswa14 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk){
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1){
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada indeks" + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1){
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk){
                return (mid);
            } 
            else if (listMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid - 1);
            } 
            else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}

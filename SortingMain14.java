public class SortingMain14 {

    public static void main(String[] args) {

        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        Sorting14 datarut1 = new Sorting14(a, a.length);
        Sorting14 datarut2 = new Sorting14(b, b.length);
        Sorting14 datarut3 = new Sorting14(c, c.length);

        System.out.println("Data Awal 1");
        datarut1.tampil();
        datarut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan Bubble Sort (ASC)");
        datarut1.tampil();
        System.out.println();

        System.out.println("Data Awal 2");
        datarut2.tampil();
        datarut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan Selection Sort (ASC)");
        datarut2.tampil();
        System.out.println();

        System.out.println("Data Awal 3");
        datarut3.tampil();
        datarut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan Insertion Sort (ASC)");
        datarut3.tampil();
        System.out.println();
    }
}

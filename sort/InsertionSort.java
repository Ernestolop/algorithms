class InsertionSort {
    public static void main(String[] args) {
        int[] listToSort = { 5, 2, 4, 6, 1, 3 };
        insertionSort(listToSort);
    }

    private static void insertionSort(int[] listToSort) {
        for (int i = 1; i < listToSort.length; i++) {
            int key = listToSort[i];
            int j = i - 1;
            while (j >= 0 && key < listToSort[j]) {
                listToSort[j + 1] = listToSort[j];
                j = j - 1;
            }
            listToSort[j + 1] = key;
        }
    }
}
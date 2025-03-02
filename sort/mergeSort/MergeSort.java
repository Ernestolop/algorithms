package mergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] listToSort = { 5, 2, 4, 6, 1, 3 };
        System.out.println("Before sorting: " + java.util.Arrays.toString(listToSort));
        mergeSort(listToSort, 0, listToSort.length - 1);
        System.out.println("After sorting: " + java.util.Arrays.toString(listToSort));
    }

    private static void mergeSort(int[] listToSort, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(listToSort, left, middle);
            mergeSort(listToSort, middle + 1, right);

            merge(listToSort, left, middle, right);
        }
    }

    private static void merge(int[] listToSort, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = listToSort[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = listToSort[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                listToSort[k] = leftArray[i];
                i++;
            } else {
                listToSort[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            listToSort[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            listToSort[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

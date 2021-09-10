package utils;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUtil {

    // Bubble Sort
    public static void bubbleSortInt(ArrayList<Integer> arr) {
        int len = arr.size();
        for (int i = 0; i < len - 1; i++ ) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSortString(ArrayList<String> arr) {
        int len = arr.size();
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                int reps = Math.min(arr.get(j).length(), arr.get(j + 1).length());
                for (int k = 0; k < reps; k++) {
                    if ((int) arr.get(j).toLowerCase().charAt(0) == (int) arr.get(j + 1).toLowerCase().charAt(0)) {
                        if ((int) arr.get(j).toLowerCase().charAt(k) > (int) arr.get(j + 1).toLowerCase().charAt(k)) {
                            String temp = arr.get(j);
                            arr.set(j, arr.get(j + 1));
                            arr.set(j + 1, temp);
                            break;
                        }
                    }
                    if ((int) arr.get(j).toLowerCase().charAt(0) > (int) arr.get(j + 1).toLowerCase().charAt(0)) {
                        String temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                        break;
                    }
                }
            }
        }
    }

    // Quick Sort
    public static void quickSortInt(ArrayList<Integer> arr, int start, int end) {
        int i = start;
        int j = end - 1;
        if (j - i >= 1) {
            int pivot = arr.get(i);
            while (j > i) {
                while (arr.get(i).compareTo(pivot) <= 0 && 1 <= end && j > i) {
                    i++;
                }
                while (arr.get(j).compareTo(pivot) >= 0 && j >= start && j >= i) {
                    j--;
                }
                if (j > i) Collections.swap(arr, i, j);
            }
            Collections.swap(arr, start, j);
            quickSortInt(arr, start, j - 1);
            quickSortInt(arr, j + 1, end);
        }
    }

    public static void quickSortString(ArrayList<String> arr, int start, int end) {
        int i = start;
        int j = end;
        if (j - i >= 1) {
            String pivot = arr.get(i);
            while (j > i) {
                while (arr.get(i).compareTo(pivot) <= 0 && i <= end && j > i) {
                    i++;
                }
                while (arr.get(j).compareTo(pivot) >= 0 && j >= start && j >= i) {
                    j--;
                }
                if (j > i) Collections.swap(arr, i, j);
            }
            Collections.swap(arr, start, j);
            quickSortString(arr, start, j - 1);
            quickSortString(arr, j + 1, end);
        }
    }
}

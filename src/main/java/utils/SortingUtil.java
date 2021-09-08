package utils;

import java.util.ArrayList;

public class SortingUtil {

    // Bubble Sort
    public static void bubbleSortInt(ArrayList<Integer> nums) {
        int len = nums.size();
        for (int i = 0; i < len - 1; i++ ) {
            for (int j = 0; j < len - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
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
}

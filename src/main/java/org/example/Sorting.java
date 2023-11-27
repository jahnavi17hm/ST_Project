package org.example;

import java.util.List;
public class Sorting {
    public List<Integer> bubbleSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }
    public List<Integer> insertionSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
        return arr;
    }
    public List<Integer> selectionSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr.get(j) < arr.get(min_idx))
                    min_idx = j;

            int temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i, temp);
        }
        return arr;
    }
    // Radix Sort
    public List<Integer> radixSort(List<Integer> arr) {
        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }

        return arr;
    }
    private int getMax(List<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    private void countingSort(List<Integer> arr, int exp) {
        int n = arr.size();
        int []output = new int[n];
        int []count = new int[10];
        java.util.Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(arr.get(i) / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr.get(i) / exp) % 10] - 1] = arr.get(i);
            count[(arr.get(i) / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr.set(i, output[i]);
        }
    }

    // Heap Sort
    public List<Integer> heapSort(List<Integer> arr) {
        int n = arr.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            heapify(arr, i, 0);
        }

        return arr;
    }

    private void heapify(List<Integer> arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }

        if (right < n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, swap);

            heapify(arr, n, largest);
        }
    }
}

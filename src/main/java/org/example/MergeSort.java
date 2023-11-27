package org.example;

import java.util.ArrayList;

public class MergeSort {
    void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary array
        int left = low; // Starting index of the left half of arr
        int right = mid + 1; // Starting index of the right half of arr

        // Storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        // If elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        // If elements on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        // Transferring all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid); // Left half
            mergeSort(arr, mid + 1, high); // Right half
            merge(arr, low, mid, high); // Merging sorted halves
        }
    }
    public int[] performMergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // No need to sort if array is null or has one element
        }
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }
}

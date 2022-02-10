package com.study.algorithm.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 6, 7, 4, 5, 8, 3, 1, 9};

        quickSort(array, 0, array.length - 1);

        for (int data : array) {
            System.out.printf(data + " ");
        }
    }

    static void quickSort(int[] data, int start, int end) {
        if (start >= end) { // 원소가 1개인 경우
            return;
        }

        int key = start; // 기준값
        int i = start + 1; // 시작값
        int j = end; // 마지막값
        int temp = 0;

        while (i <= j) { // 엇갈릴 때까지 반복
            while (i <= end && data[i] <= data[key]) {
                i++;
            }
            while (j > start && data[j] >= data[key] ) {
                j--;
            }
            if (i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {
                temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }
}

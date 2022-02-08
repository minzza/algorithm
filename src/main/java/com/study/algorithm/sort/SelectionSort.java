package com.study.algorithm.sort;

/*
 * 선택 정렬 구현
 * 시간 복잡도 : O(N^2)
 * 다른 정렬 알고리즘과 비교할 경우 비효율적이다.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 6, 7, 4, 5, 8, 3, 1, 9};

        int temp = 0, index = 0;

        for (int i = 0; i < array.length; i++) {
            int min = 9999; // 정렬이 한 번 이뤄지면 새롭게 비교해야하므로 초기화

            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}

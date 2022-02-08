package com.study.algorithm.sort;

/*
 * 버블 정렬 구현
 * 시간 복잡도 : O(N^2)
 * 가장 쉽움, 가장 비효율적, 가장 느림
 * 선택 정렬과 시간 복잡도는 같지만 실제 시간은 선택 정렬보다 훨씬 느리다.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 6, 7, 4, 5, 8, 3, 1, 9};

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) { // - i를 해주는 이유 : 정렬이 1회 끝날 때마다 뒤는 볼 필요가 없다
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

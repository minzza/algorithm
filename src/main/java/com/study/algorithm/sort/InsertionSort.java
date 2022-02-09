package com.study.algorithm.sort;

/*
 * 삽입 정렬 구현
 * 시간 복잡도 : O(N^2)
 * 거의 정렬이 된 상태라면 가장 효율적이다.
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {10, 2, 6, 7, 4, 5, 8, 3, 1, 9};
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            while (array[index] > array[index + 1]) {
                int temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
                index--;

                // i = 0일 경우 index = -1이 되므로
                if( index < 0){
                    break;
                }
            }
        }
        for (int unit : array) {
            System.out.print(unit + ",");
        }
    }
}

package com.study.algorithm.baekjoon.success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2752 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int array[] = new int[3];

        int x = 0;
        while (st.hasMoreTokens()) {
            array[x] = Integer.parseInt(st.nextToken());
            x++;
        }

        int temp = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int min = 1000001;
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

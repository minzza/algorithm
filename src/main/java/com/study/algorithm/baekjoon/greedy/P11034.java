package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = null;
        while ((temp = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(temp, " ");

            int[] array = new int[3];
            int idx = 0;
            while (st.hasMoreTokens()) {
                array[idx] = Integer.parseInt(st.nextToken());
                idx++;
            }

            int max = Integer.MIN_VALUE;
            for (int i = 1; i < array.length; i++) {
                int minus = array[i] - array[i - 1];
                if (minus > max) {
                    max = minus;
                }
            }
            System.out.println(max - 1);
        }
    }
}

package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int[][] array = new int[N][2];
            StringTokenizer st = null;
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = 0;
                while (st.hasMoreTokens()) {
                    array[j][x] = Integer.parseInt(st.nextToken());
                    x++;
                }
            }

            Arrays.sort(array, Comparator.comparingInt(o1 -> o1[0]));

            int result = 1;
            int min = array[0][1];
            for (int j = 1; j < N; j++) {
                if (array[j][1] < min) {
                    min = array[j][1];
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

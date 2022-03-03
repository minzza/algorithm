package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] levels = new int[N];
        for (int i = 0; i < N; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }


        int cnt = 0;
        for (int i = N - 2; i >= 0; i--) {
            if (levels[i] >= levels[i + 1]) {
                cnt += levels[i] - levels[i + 1] + 1;
                levels[i] = levels[i + 1] - 1;
            }
        }
        System.out.println(cnt);

    }
}

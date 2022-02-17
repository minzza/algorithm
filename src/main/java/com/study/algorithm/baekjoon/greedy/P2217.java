package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2217 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ropes[] = new int[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        int max = 0;
        for (int i = 0; i < ropes.length; i++) {
            int weight = ropes[i] * (ropes.length - i);
            max = max > weight ? max : weight;
        }
        System.out.println(max);
    }
}

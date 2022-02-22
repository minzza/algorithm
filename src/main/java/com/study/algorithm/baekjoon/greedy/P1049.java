package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] packages = new int[M];
        int[] units = new int[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            packages[i] = Integer.parseInt(st.nextToken());
            units[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(packages);
        Arrays.sort(units);

        int min = Integer.MAX_VALUE;
        min = Math.min(((N / 6) + 1) * packages[0], N * units[0]); // 가장 싼 패키지로 구매(+1 하는 이유는 남는 경우 패키지를 하나 더 사야하기때문) vs 가장 싼 낱개로 구매
        min = Math.min(min, ((N / 6) * packages[0]) + (N % 6) * units[0]); // 위 결과 vs 가장 싼 패키지를 구매 후 가장 싼 낱개를 구매
        System.out.println(min);
    }
}

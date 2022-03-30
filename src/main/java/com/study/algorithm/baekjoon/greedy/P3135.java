package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        int min = Math.abs(A - B);
        for (int i = 0; i < N; i++) {
            int temp = Math.abs(Integer.parseInt(br.readLine()) - B) + 1;
            min = Math.min(temp, min);
        }
        System.out.println(min);
    }
}

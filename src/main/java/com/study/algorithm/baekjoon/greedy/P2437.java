package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int index = 0;
        while (st.hasMoreTokens()) {
            array[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(array);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if(sum + 1 < array[i]){
                break;
            }
            sum += array[i];
        }
        System.out.println(sum + 1);
    }
}

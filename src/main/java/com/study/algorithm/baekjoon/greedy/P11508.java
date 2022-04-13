package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P11508 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] milks = new Integer[N];

        for (int i = 0; i < N; i++) {
            milks[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(milks, Collections.reverseOrder());

        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            sum += milks[i];
            count++;

            if(count == 3){
                count = 0;
                sum -= milks[i];
            }
        }
        System.out.println(sum);
    }
}

package com.study.algorithm.baekjoon.retry;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cross_count = 1, prev_count_sum = 0;

        while (true) {
            // 1 <= 1
            if (n <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) {
                    System.out.println((cross_count - (n - prev_count_sum - 1)) + "/" + (n - prev_count_sum));
                    break;
                } else {
                    System.out.println((n - prev_count_sum) + "/" + (cross_count - (n - prev_count_sum - 1)));
                    break;
                }
            }
            else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}

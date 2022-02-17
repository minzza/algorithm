package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5585 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] coins = {500, 100, 50, 10, 5, 1};
        int change = 1000 - Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < coins.length; i++) {
            // 500 <= 620
            while (coins[i] <= change) {
                change = change - coins[i];
                count++;
            }
        }
        System.out.println(count);
    }
}

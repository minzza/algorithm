package com.study.algorithm.baekjoon.greedy;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coins = {25, 10, 5, 1};

        int T = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < coins.length; j++) {
                int result = 0;
                if (coins[j] <= N){
                    result = N / coins[j];
                    N = N % coins[j];
                }
                sb.append(result).append(" ");
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }

    }
}

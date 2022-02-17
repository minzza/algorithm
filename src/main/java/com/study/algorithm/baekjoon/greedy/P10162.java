package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10162 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] secs = {300, 60, 10};

        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        if ((N % 10) > 0) {
            sb.append("-1");
        } else {
            for (int i = 0; i < secs.length; i++) {
                int count = 0;
                while (secs[i] <= N) {
                    N = N - secs[i];
                    count++;
                }
                sb.append(count).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

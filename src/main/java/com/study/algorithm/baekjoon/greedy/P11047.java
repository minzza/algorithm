package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P11047 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (coins.get(i) <= money) {
                count += (money / coins.get(i));
                money = (money % coins.get(i));
            }
        }
        System.out.println(count);
    }
}

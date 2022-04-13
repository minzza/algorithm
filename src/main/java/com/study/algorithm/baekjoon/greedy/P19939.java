package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19939 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ball = Integer.parseInt(st.nextToken());
        int basket = Integer.parseInt(st.nextToken());

        for (int i = 0; i < basket; i++) {
            ball -= i + 1;
            if (ball < 0) {
                break;
            }
        }

        if (ball >= 0) {
            if (ball % basket > 0) {
                System.out.println(basket);
            } else {
                System.out.println(basket - 1);
            }
        } else {
            System.out.println(-1);
        }
    }
}

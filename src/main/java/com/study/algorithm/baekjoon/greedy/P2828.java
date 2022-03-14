package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int apple = Integer.parseInt(br.readLine());

        int left = 1;
        int right = M;
        int cnt = 0;

        for (int i = 0; i < apple; i++) {
            int where = Integer.parseInt(br.readLine());
            if (left <= where && where <= right) {
                continue;
            }

            if (left > where) {
                cnt += (left - where);
                right -= (left - where);
                left = where;
            } else {
                cnt += (where - right);
                left += (where - right);
                right = where;

            }
        }
        System.out.println(cnt);


    }
}

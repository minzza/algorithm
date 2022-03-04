package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list, Collections.reverseOrder());

        int day = 2;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt = Math.max(cnt, day + list.get(i));
            day++;
        }
        System.out.println(cnt);
    }
}

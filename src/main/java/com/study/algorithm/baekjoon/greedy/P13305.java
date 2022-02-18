package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13305 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long[] meters = new long[N - 1];
        for (int i = 0; i < meters.length; i++) {
            meters[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");

        long[] moneys = new long[N];
        for (int i = 0; i < moneys.length; i++) {
            moneys[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = moneys[0];
        for (int i = 0; i < moneys.length - 1; i++) {
           if(moneys[i] < min){
               min = moneys[i];
           }
            sum += (min * meters[i]);
        }

        System.out.println(sum);
    }
}

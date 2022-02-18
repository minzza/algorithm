package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1789 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long S = Long.parseLong(br.readLine());

        long total = 0;
        int cnt = 0;
        while (true) {
            total += cnt;

            if(total > S){
                break;
            }
            cnt++;
        }
        System.out.println(cnt-1);
    }
}

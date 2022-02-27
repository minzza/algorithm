package com.study.algorithm.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P22864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int max = 0;
        int totalA = 0;
        for (int i = 1; i <= 24; i++) {
            if (A > M) {
                break;
            }

            int temp = A + totalA;

            if(temp <= M){
                max += B;
                totalA += A;
            } else {
                totalA -= C;
                if (totalA < 0) {
                    totalA = 0;
                }
            }


        }
        System.out.println(max);
    }
}
